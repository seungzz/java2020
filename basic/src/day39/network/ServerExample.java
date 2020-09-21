package day39.network;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {	//ServerSocket 생성과 연결수락
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost",5001));
				while(true) {
					System.out.println("[연결 기다림]");
					Socket socket = serverSocket.accept();	//클라이언트 연결수락
					InetSocketAddress isa = (InetSocketAddress)	socket.getRemoteSocketAddress();
					System.out.println("[연결 수락함]"+isa.getHostName());
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
