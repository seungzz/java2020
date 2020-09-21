package day42.nio.ASynchronous;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.EnumSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AsynchronousFileChannelWriteExample {
	public static void main(String[] args) throws Exception{
		ExecutorService excutorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors());
		
		for(int i=0; i<10; i++) {
			Path path = Paths.get("c:/Temp/file"+i+".txt");
			Files.createDirectories(path.getParent());
			
			//비동기 파일 생성
			AsynchronousFileChannel fileChannel = 
					AsynchronousFileChannel.open(path, EnumSet.of(
							//EnumSet.of()메소드는 매개값으로 나열된 열거 상수를 Set객체에 담아 반환하는 메소드
							StandardOpenOption.CREATE, StandardOpenOption.WRITE),excutorService);
		
			//파일에 저장할 데이터를 ByteBuffer에 저장
			Charset charset = Charset.defaultCharset();
			ByteBuffer byteBuffer = charset.encode("안녕하세요");
		
			//첨부 객체 생성
			class Attachment {
				Path path;	//파일경로저장
				AsynchronousFileChannel fileChannel; //비동기 파일 채널 저장
			}
			
			Attachment attachment = new Attachment();
			attachment.path = path;
			attachment.fileChannel = fileChannel;
			
			//CompletionHandler객체생성	
			CompletionHandler<Integer, Attachment> completionHandler =
					//CompletionHandler는 롤백 메소드를 사용하기 위한 객체로서
					//Attachment는 롤백 메소드에 넣어줄 추가 정보를 넣어주는 역할을 합니다.
					//첨부 객체가 필요없다면 null입력가능
					new CompletionHandler<Integer, Attachment>() {
				//Integer 값의 경우 read()와 write() 호출시 작업결과를 읽거나 쓴 바이트 수.
				@Override
				public void completed(Integer result, Attachment attachment) {
					System.out.println(attachment.path.getFileName()+" : "+result+"byte written:"+
														Thread.currentThread().getName());
				try {attachment.fileChannel.close();}
				catch(IOException e) {}
				}
				@Override
				public void failed(Throwable exc, Attachment attachment) {
					exc.printStackTrace();
					try {attachment.fileChannel.close();
					
					}catch (IOException e) {
						
					}
				}
			};
			fileChannel.write(byteBuffer,0,attachment, completionHandler);
			
			
		}
		//스레드풀 종료
		Thread.sleep(1000);
		excutorService.shutdown();
		
	}
}
