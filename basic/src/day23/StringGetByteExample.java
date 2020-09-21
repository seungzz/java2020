package day23;

import java.io.UnsupportedEncodingException;

public class StringGetByteExample {
	public static void main(String[] args) {
		String str = "¾È³çÇÏ¼¼¿ä";
		
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length : "+bytes1.length);
		String str1 = new String(bytes1);
		System.out.println("bytes -> String" +str1);
		
		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length : "+bytes2.length);
			String str2 = new String(bytes2,"EUC-KR");
			System.out.println("byte2 -> String : "+str2);
		}catch(UnsupportedEncodingException e) {
			
		}
	}
}
