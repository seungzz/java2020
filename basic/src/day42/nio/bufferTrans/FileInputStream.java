package day42.nio.bufferTrans;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileInputStream {
	public static void main(String[] args)	throws IOException {
		Path path = Paths.get("c:/Temp/file.txt");
		Files.createDirectories(path.getParent());
		//부모 폴더를 모두 생성
		
		FileInputStream fis = new FileInputStream("c:/Temp");
		FileChannel fileChannel0 = fis.getChannel();
		
		FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.CREATE,StandardOpenOption.WRITE);
		//open()메소드를 통해서 얻을수도 있습니다.
		//create -> 파일이 없으면 새로 생성
		//write -> 쓰기용으로 파일을 연다.
		//read -> 읽기용으로 파일을 연다.
		//create_new -> 새 파일을 만든다. 이미 파ㅣㄹ이 있으면 예외와 함께 실패
		//append -> 파일 끝에 새로운 데이터를 추가한다. write나 create와 함께 사용
		//delete_on_close -> 채널을 닫을때 파일을 삭제한다.
		
		
		String data = "안녕하세요~";
		Charset charset = Charset.defaultCharset();
		ByteBuffer byteBuffer = charset.encode(data);
		
		int byteCount = fileChannel.write(byteBuffer);
		System.out.println("file.txt: "+byteCount +"bytes writter");
		
		fileChannel.close();
	}
}
