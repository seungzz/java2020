package day41.nio.buffer;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public class BufferExample {
	public static void main(String[] args) {
		System.out.println("[7바이트 크기의 버퍼생성]");
		ByteBuffer buffer = ByteBuffer.allocateDirect(7);
		printState(buffer);
		
		buffer.put((byte)10);	//상대적 저장, 포지션이 알아서 값을 저장해줌
		//buffer.put(index,byte);     절대적 저장은 인덱스가 따로 첫번쨰 매개변수에 있다.
		buffer.put((byte)11);
		System.out.println("[2바이트저장후]");
		printState(buffer);
		
		buffer.put((byte)12);
		buffer.put((byte)13);
		buffer.put((byte)14);
		System.out.println("[3바이트저장후]");
		printState(buffer);
		
		buffer.flip();
		System.out.println("[flip()실행후]");
		printState(buffer);
		
		
		buffer.mark();
		System.out.println("현재 위치를 마크해놓음");
		
		buffer.get(new byte[2]);
		System.out.println("[2바이트 읽은 후]");
		printState(buffer);
		
		buffer.reset();
		System.out.println("position을 마크 위치로 옮김");
		printState(buffer);
		
		buffer.rewind();
		System.out.println("rewind()실행후");
		printState(buffer);
		
		buffer.clear();
		System.out.println("[clear()실행 후]");
		printState(buffer);
		
		
	}
	
	public static void printState(Buffer buffer) {
		System.out.print("\tposition : "+buffer.position()+",");
		System.out.print("\tlimit : "+buffer.limit()+",");
		System.out.println("\tcapacity : "+buffer.capacity());
	}
}
