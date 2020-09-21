package day42.nio.network;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;

public class TCPCilentExample {
	public static void main(String[] args) {
		SocketChannel socketChannel = null;
		try {
			socketChannel = SocketChannel.open();
			socketChannel.configureBlocking(true);
			System.out.println("연결요청");
			socketChannel.connect(new InetSocketAddress("localhost",5001));
			System.out.println("연결성공");
		}catch(Exception e) {}
		
		if(socketChannel.isOpen()) {
			try {
				socketChannel.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
  }
}