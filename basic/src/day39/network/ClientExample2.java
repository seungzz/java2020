package day39.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample2 {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket();
			System.out.println("[�����û]");
			socket.connect(new InetSocketAddress("localhost",5001));
			System.out.println("[���Ἲ��]");
			
			byte[] bytes = null;
			String message = null;
			OutputStream os = socket.getOutputStream();
			message = "Hello Server";
			bytes = message.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			System.out.println("[�����ͺ����⼺��]");
			
			InputStream is = socket.getInputStream();
			bytes = new byte[100];
			int readByteCount = is.read(bytes);
			message = new String(bytes,0,readByteCount,"UTF-8");
			System.out.println("[�����͹ޱ⼺��]: "+message);
			
			os.close();
			is.close();
		}catch(Exception e ) {}
		
		if(!socket.isClosed()) {
			try {
				socket.close();
			}catch(IOException e1) {
				
			}
		}
	}
}
