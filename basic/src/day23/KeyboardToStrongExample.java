package day23;

import java.io.IOException;

public class KeyboardToStrongExample {
	public static void main(String[] args) throws IOException{
		byte[] bytes = new byte[100];
		//����ִ� �迭�̾����� system.out���� �Է½�Ų��.
		
		
		System.out.println("�Է�: ");
		int readByteNo = System.in.read(bytes);
		
		System.out.println("byte�� ���� :" +readByteNo);
		
		String str = new String(bytes, 0, readByteNo-2);	//0�ε�������
		System.out.println(str);
	}
}
