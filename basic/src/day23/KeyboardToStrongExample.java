package day23;

import java.io.IOException;

public class KeyboardToStrongExample {
	public static void main(String[] args) throws IOException{
		byte[] bytes = new byte[100];
		//비어있는 배열이었지만 system.out에서 입력시킨다.
		
		
		System.out.println("입력: ");
		int readByteNo = System.in.read(bytes);
		
		System.out.println("byte의 갯수 :" +readByteNo);
		
		String str = new String(bytes, 0, readByteNo-2);	//0인덱스부터
		System.out.println(str);
	}
}
