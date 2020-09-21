package day37.IO;

import java.io.InputStream;

public class SystemInExample2 {
	public static void main(String[] args) throws Exception{
		InputStream is = System.in;
		
		byte[] datas = new byte[100];	//여러개의 데이터를 한꺼번에 받을 수 있다.
		
		System.out.println("이름: ");
		int nameBytes = is.read(datas);
		
		String name = new String(datas,0, nameBytes-2);	//0번 인덱스에서 -2번째까지 확인하는것
														//줄바꿈, 캐비지 리턴때문에 -2해준것
		System.out.println("하고 싶은 말: ");
		int commentBytes = is.read(datas);

		String comment = new String(datas, 0, commentBytes-2);
		
		System.out.println("입력한 이름: "+name);
		System.out.println("입력한 하고싶은 말: "+comment);
	}
}
