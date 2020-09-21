package day39.ex;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) throws Exception{
		ServerSocket serverSocket = new ServerSocket();
		//서버로 지정해주기 위해 ServerSocket생성
		serverSocket.bind(new InetSocketAddress(5001));
		//5001번 포트에 serverSocket바인딩해준다.
		
		System.out.println("[서버시작]");
		 
		while (true) {
			try {
				Socket socket = serverSocket.accept();
				// ServerSocket은 클라이언트가 연결요청을 해오면 accept()로 연결 수락을 한다. 
				// 만약 accept()에서 블로킹이 되어있을때 serverSovket을 닫기 위해 close()를 호출하면 SocketException이 발생하->try/catch
				
				InputStream is = socket.getInputStream();
				//파일을 받기 위해 InputStream 생성
				
				byte[] bytes = new byte[1000];	//크기가 1000인 바이트 배열을 생성
				int readByteCount =-1;
				
				//클라이언트가 보낸 100바이트를 먼저 읽고 파일 이름을 얻어낸다.
				is.read(bytes,0,100);
				String fileName = new String(bytes,0,100,"UTF-8");
				fileName = fileName.trim();	//공백제거
				
				System.out.println("[파일받기시작]"+fileName);
				FileOutputStream fos = new FileOutputStream("c:/Temp/"+fileName);
				
				
				while((readByteCount = is.read(bytes))!= -1) {
					fos.write(bytes,0,readByteCount);
				}fos.flush();
				
				System.out.println("[파일 받기 완료]");
				
				fos.close();
				is.close();
				socket.close();
			}catch(Exception e) {
				break;
			}
	
		}
		
		serverSocket.close();
		System.out.println("[서버종료]");
	}	
	
}
