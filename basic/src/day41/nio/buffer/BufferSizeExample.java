package day41.nio.buffer;

import java.nio.ByteBuffer;

public class BufferSizeExample {
	public static void main(String[] args) {
		ByteBuffer diredctBuffer = ByteBuffer.allocate(2000*1024*1024); 	
		System.out.println("다이렉트 버퍼가 생성되었습니다. ");
		
		
		
		ByteBuffer nonDirectBuffer = ByteBuffer.allocate(2000*1024*1024);
		System.out.println("논다이렉트 버퍼가 생성되었습니다. ");
		
	}
}
