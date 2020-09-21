package day42.nio.bufferTrans;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;

public class ByteBufferToIntBufferExample {
	//int[]	�迭�� �����ϰ� �̰��� �����̳� ��Ʈ��ũ�� ����ϱ� ���ؼ�
	//int[] �迭 �Ǵ� IntBuffer�κ��� ByteBuffer�� �����ؾ� �Ѵ�.
	
	public static void main(String[] args) {
		//int[] -> IntBuffer -> ByteBuffer
		int[] writeData = {10,20};
		IntBuffer writeIntBuffer = IntBuffer.wrap(writeData);
		//wrap()�� ����̷�Ʈ ���۸� ����� �޼ҵ�(�Ű����� �迭�� ����)
		
		ByteBuffer writeByteBuffer = ByteBuffer.allocate(writeIntBuffer.capacity()*4);
		
		for(int i=0; i<writeIntBuffer.capacity();i++) {
			writeByteBuffer.putInt(writeIntBuffer.get(i));
			
		}
		writeByteBuffer.flip();	//position�� 0���� �̵�
		
		
		//ByteBuffer -> IntBuffer -> int[]
		ByteBuffer readBytebuffer = writeByteBuffer;
		IntBuffer readIntBuffer = readBytebuffer.asIntBuffer();
		//.asIntBuffer() ���� �޼ҵ�� ByteBuffer�� �ش� ���۷� ��ȯ�����ݴϴ�
		int[] readData = new int[readIntBuffer.capacity()];
		readIntBuffer.get(readData);	//�Ű������� �־��ָ� �Ű������� �����ϴ� �����̴�.
		System.out.println("�迭����: "+Arrays.toString(readData));
	}
}
