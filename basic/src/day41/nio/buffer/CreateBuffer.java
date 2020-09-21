package day41.nio.buffer;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

public class CreateBuffer {
	public static void main(String[] args) {
		ByteBuffer byteBuffer = ByteBuffer.allocate(100*1024*1024);
		CharBuffer charBuffer = CharBuffer.allocate(100);
		//allocate()�޼ҵ�� Ÿ�Ժ��� ����̷�Ʈ ���۸� �����ϴ� �޼ҵ��Դϴ�.
		
		
		byte[] byteArray = new byte[100];
		ByteBuffer byteBuffer2 = ByteBuffer.wrap(byteArray);
		char[] charArray = new char[100];
		CharBuffer charBuffer2 = CharBuffer.wrap(charArray);
		//wrap() �޼ҵ�� �̹� �����Ǿ��ִ� �ڸ��迭�� �̵��� Buffer��ü�� �����Ѵ�.
		
		byte[] byteArray2 = new byte[100];
		ByteBuffer byteBuffer3 = ByteBuffer.wrap(byteArray2,0,50);
		//wrap()�޼ҵ�� �迭�� ��� �����Ͱ� �ƴ϶� �Ϻ� �����͸����ε� ���� ��ü�� ������ �� �ִ�.
		
		char[] charArray2 = new char[100];
		CharBuffer charBuffer3 = CharBuffer.wrap("NIO ������� ���۸� �̿��մϴ�.");
		//charbuffer�� wrap()�޼ҵ忡�� ���ڿ��� charbuffer�� �����Ҽ��� �ִ�. 
		
		
		//allocateDirect() �޼ҵ��  ByteBuffer���� �����Ǳ� ������ �� Ÿ�Ժ��� ���̷�Ʈ ���۸�
		//�����ϰ� �ʹٸ� �켱 ByteBuffer�� allocataDirect()�޼ҵ�� ���۸� ������ ������
		//��ȯ �޼ҵ带 �̿��ؼ� �ش� Ÿ�Ժ� buffer�� ������ �˴ϴ�.
		ByteBuffer byteBuffer4 = ByteBuffer.allocateDirect(100);
		//100���� ����Ʈ�� ����
		
		CharBuffer charBuffer4 = ByteBuffer.allocateDirect(100).asCharBuffer();
		//50����char���� ����
		IntBuffer intBuffer = ByteBuffer.allocateDirect(100).asIntBuffer(); 
		//25���� int���� ����
	}
}
