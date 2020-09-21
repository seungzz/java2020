package day39.ex;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) throws Exception{
		ServerSocket serverSocket = new ServerSocket();
		//������ �������ֱ� ���� ServerSocket����
		serverSocket.bind(new InetSocketAddress(5001));
		//5001�� ��Ʈ�� serverSocket���ε����ش�.
		
		System.out.println("[��������]");
		 
		while (true) {
			try {
				Socket socket = serverSocket.accept();
				// ServerSocket�� Ŭ���̾�Ʈ�� �����û�� �ؿ��� accept()�� ���� ������ �Ѵ�. 
				// ���� accept()���� ���ŷ�� �Ǿ������� serverSovket�� �ݱ� ���� close()�� ȣ���ϸ� SocketException�� �߻���->try/catch
				
				InputStream is = socket.getInputStream();
				//������ �ޱ� ���� InputStream ����
				
				byte[] bytes = new byte[1000];	//ũ�Ⱑ 1000�� ����Ʈ �迭�� ����
				int readByteCount =-1;
				
				//Ŭ���̾�Ʈ�� ���� 100����Ʈ�� ���� �а� ���� �̸��� ����.
				is.read(bytes,0,100);
				String fileName = new String(bytes,0,100,"UTF-8");
				fileName = fileName.trim();	//��������
				
				System.out.println("[���Ϲޱ����]"+fileName);
				FileOutputStream fos = new FileOutputStream("c:/Temp/"+fileName);
				
				
				while((readByteCount = is.read(bytes))!= -1) {
					fos.write(bytes,0,readByteCount);
				}fos.flush();
				
				System.out.println("[���� �ޱ� �Ϸ�]");
				
				fos.close();
				is.close();
				socket.close();
			}catch(Exception e) {
				break;
			}
	
		}
		
		serverSocket.close();
		System.out.println("[��������]");
	}	
	
}
