package day42.nio.network;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;

public class TCPClinetExample2 {
	public static void main(String[] args) {
		SocketChannel socketChannel = null;
		try {
			socketChannel = SocketChannel.open();
			socketChannel.configureBlocking(true);
			System.out.println("연결요청");
			socketChannel.connect(new InetSocketAddress("localhost",5001));
			System.out.println("[연결성공]");
			
			ByteBuffer byteBuffer = null;
			Charset charset = Charset.forName("UTF-8");
			byteBuffer = charset.encode("Hello Server");
			socketChannel.write(byteBuffer);
			System.out.println("데이터보내기성공");
			
			byteBuffer = ByteBuffer.allocate(100);
			int byteCount = socketChannel.read(byteBuffer);
			byteBuffer.flip();
			String message = charset.decode(byteBuffer).toString();
			System.out.println("[데이터받기성공] :"+message);
			
		}catch (Exception e) {}
		if(socketChannel.isOpen()) {
			try {
				socketChannel.close();
				
			}catch (IOException e ) {
				e.printStackTrace();
			}
		}
	}
}
