package day42.nio.bufferTrans;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;

public class ByteBufferToIntBufferExample {
	//int[]	배열을 생성하고 이것을 파일이나 네트워크로 출력하기 위해서
	//int[] 배열 또는 IntBuffer로부터 ByteBuffer를 생성해야 한다.
	
	public static void main(String[] args) {
		//int[] -> IntBuffer -> ByteBuffer
		int[] writeData = {10,20};
		IntBuffer writeIntBuffer = IntBuffer.wrap(writeData);
		//wrap()은 논다이렉트 버퍼를 만드는 메소드(매개변수 배열을 통해)
		
		ByteBuffer writeByteBuffer = ByteBuffer.allocate(writeIntBuffer.capacity()*4);
		
		for(int i=0; i<writeIntBuffer.capacity();i++) {
			writeByteBuffer.putInt(writeIntBuffer.get(i));
			
		}
		writeByteBuffer.flip();	//position을 0으로 이동
		
		
		//ByteBuffer -> IntBuffer -> int[]
		ByteBuffer readBytebuffer = writeByteBuffer;
		IntBuffer readIntBuffer = readBytebuffer.asIntBuffer();
		//.asIntBuffer() 같은 메소드는 ByteBuffer를 해당 버퍼로 변환시켜줍니다
		int[] readData = new int[readIntBuffer.capacity()];
		readIntBuffer.get(readData);	//매개변수를 넣어주면 매개변수에 저장하는 형태이다.
		System.out.println("배열복원: "+Arrays.toString(readData));
	}
}
