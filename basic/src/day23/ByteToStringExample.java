package day23;

public class ByteToStringExample {
	public static void main(String[] args) {
		byte[] bytes = {72,101,108,108,111,32,74,97,118,97};
		//바이트 숫자를 넣지만 네트워크를 통해 정보를 보내고 해석한다.  
		String str1 = new String(bytes);
		System.out.println(str1);
		
		
		String str2 = new String(bytes, 6, 4);	//6번째부터 4개의 데이터를 읽겠다.
		System.out.println(str2);
	}
}
