package day39.ex;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) {
		Socket socket = null;
	
		try {
			 socket = new Socket("localhost",5001);
			
			
			String filePath = 
					"c:/Temp/D:\\JAVA01\\basic\\src\\day39\\network.java";
			File file = new File(filePath);
			
			String fileName = file.getName();
			OutputStream os = socket.getOutputStream();
			byte[] bytes = fileName.getBytes("UTF-8");
			os.write(bytes);
		
			
			System.out.println("[파일 보내기 시작]"+fileName);
			
			
			FileInputStream fis = new FileInputStream(file);
			int readByteNO;
			byte[] readBytes = new byte[100];
			
			
			os.flush();
			System.out.println("[파일보내기완료]");
			
			fis.close();
			os.close();
		}catch(Exception e) {}
			if(!socket.isClosed()) {
				try {
				socket.close();
			} catch(IOException e1) {}
		
		}	
	}
}
	
	
