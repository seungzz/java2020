package day42.nio.network;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;

public class TCPServerExample2 {
	public static void main(String[] args) {
		ServerSocketChannel serverSocketChannel = null;
		try {
			serverSocketChannel = serverSocketChannel.open();
			serverSocketChannel.configureBlocking(true);
			serverSocketChannel.bind((new InetSocketAddress(5001)));
		while(true) {
			System.out.println("[연결기다림]");
			SocketChannel socketChannel = serverSocketChannel.accept();
			InetSocketAddress isa = (InetSocketAddress) socketChannel.getRemoteAddress();
			System.out.println("연결수락함]"+isa.getHostName());
			
			ByteBuffer bytebuffer = null;
			Charset charset = Charset.forName("UTF-8");
			
			bytebuffer = ByteBuffer.allocate(100);
			int byteCount = socketChannel.read(bytebuffer);
			bytebuffer.flip();
			String message = charset.decode(bytebuffer).toString();
			System.out.println("[데이터받기성공]"+message);
			bytebuffer = charset.encode("Hello Client");
			socketChannel.write(bytebuffer);
			System.out.println("[데이터보내기성공]");
		}
		}catch (Exception e) {
			
		}if(serverSocketChannel.isOpen()) {
			try {
				serverSocketChannel.close();
			}catch( IOException e ) {
				e.printStackTrace();
			}
		}
	}
}
