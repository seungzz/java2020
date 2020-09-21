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
			
			//�񵿱� ���� ����
			AsynchronousFileChannel fileChannel = 
					AsynchronousFileChannel.open(path, EnumSet.of(
							//EnumSet.of()�޼ҵ�� �Ű������� ������ ���� ����� Set��ü�� ��� ��ȯ�ϴ� �޼ҵ�
							StandardOpenOption.CREATE, StandardOpenOption.WRITE),excutorService);
		
			//���Ͽ� ������ �����͸� ByteBuffer�� ����
			Charset charset = Charset.defaultCharset();
			ByteBuffer byteBuffer = charset.encode("�ȳ��ϼ���");
		
			//÷�� ��ü ����
			class Attachment {
				Path path;	//���ϰ������
				AsynchronousFileChannel fileChannel; //�񵿱� ���� ä�� ����
			}
			
			Attachment attachment = new Attachment();
			attachment.path = path;
			attachment.fileChannel = fileChannel;
			
			//CompletionHandler��ü����	
			CompletionHandler<Integer, Attachment> completionHandler =
					//CompletionHandler�� �ѹ� �޼ҵ带 ����ϱ� ���� ��ü�μ�
					//Attachment�� �ѹ� �޼ҵ忡 �־��� �߰� ������ �־��ִ� ������ �մϴ�.
					//÷�� ��ü�� �ʿ���ٸ� null�Է°���
					new CompletionHandler<Integer, Attachment>() {
				//Integer ���� ��� read()�� write() ȣ��� �۾������ �аų� �� ����Ʈ ��.
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
		//������Ǯ ����
		Thread.sleep(1000);
		excutorService.shutdown();
		
	}
}
