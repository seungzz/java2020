package day41.nio.buffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class ComputerbyteOrderExample {
	public static void main(String[] args) {
		System.out.println("운영체제 종류: "+System.getProperty("os.name"));
		System.out.println("네이티브의 바이트 해석 순서: "+ByteOrder.nativeOrder());
		//자바는 기본적으로 Big endian으로 동작하도록 되어있다.(앞에서부터)
		//윈도우는 기본적으로 LITTLE_ENDIAN 방식으로 동작하도록 되어있음(뒤부터)
		
		ByteBuffer byteBuffer = ByteBuffer.allocate(100).order(ByteOrder.nativeOrder());
		//운영체제와 JVM의 바이트 해석 순서가 다를 경우 다이렉트 버퍼일 경우에는 운영체제의 native I/O를 
		//사용하므로 운영체제의 기본 해석 순서로 JVM의 해석순서를 맞추는 것이 성능에 도움됨.
		//order()메소드를 통해 nativeOrder()의 리턴값으로 생성해주면 된다.
	}
}
