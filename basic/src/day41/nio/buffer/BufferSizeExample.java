package day41.nio.buffer;

import java.nio.ByteBuffer;

public class BufferSizeExample {
	public static void main(String[] args) {
		ByteBuffer diredctBuffer = ByteBuffer.allocate(2000*1024*1024); 	
		System.out.println("���̷�Ʈ ���۰� �����Ǿ����ϴ�. ");
		
		
		
		ByteBuffer nonDirectBuffer = ByteBuffer.allocate(2000*1024*1024);
		System.out.println("����̷�Ʈ ���۰� �����Ǿ����ϴ�. ");
		
	}
}
