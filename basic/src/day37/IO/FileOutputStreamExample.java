package day37.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
	public static void main(String[] args) throws Exception	{
		String originalFlieName = "D:\\JAVA01\\basic\\src\\day37\\IO\\f.jpg";
		String targetFileName = "c:\\Temp\\f.jpg";
		
		FileInputStream fis = new FileInputStream(originalFlieName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		while((readByteNo = fis.read(readBytes)) != -1) {
			fos.write(readBytes,0,readByteNo);
			
		}
		fos.flush();
		fos.close();
		fis.close();
		System.out.println("복사가 잘되었습니다.");
		
	}
}
