package day41.nio.buffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class ComputerbyteOrderExample {
	public static void main(String[] args) {
		System.out.println("�ü�� ����: "+System.getProperty("os.name"));
		System.out.println("����Ƽ���� ����Ʈ �ؼ� ����: "+ByteOrder.nativeOrder());
		//�ڹٴ� �⺻������ Big endian���� �����ϵ��� �Ǿ��ִ�.(�տ�������)
		//������� �⺻������ LITTLE_ENDIAN ������� �����ϵ��� �Ǿ�����(�ں���)
		
		ByteBuffer byteBuffer = ByteBuffer.allocate(100).order(ByteOrder.nativeOrder());
		//�ü���� JVM�� ����Ʈ �ؼ� ������ �ٸ� ��� ���̷�Ʈ ������ ��쿡�� �ü���� native I/O�� 
		//����ϹǷ� �ü���� �⺻ �ؼ� ������ JVM�� �ؼ������� ���ߴ� ���� ���ɿ� �����.
		//order()�޼ҵ带 ���� nativeOrder()�� ���ϰ����� �������ָ� �ȴ�.
	}
}
