package day39.network;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {	//ServerSocket ������ �������
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost",5001));
				while(true) {
					System.out.println("[���� ��ٸ�]");
					Socket socket = serverSocket.accept();	//Ŭ���̾�Ʈ �������
					InetSocketAddress isa = (InetSocketAddress)	socket.getRemoteSocketAddress();
					System.out.println("[���� ������]"+isa.getHostName());
				}
		} catch (IOException e) {
			
		}
		
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			}catch(IOException e1) {
				
			}
		}
		
	}
}
