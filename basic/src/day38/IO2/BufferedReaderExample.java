package day38.IO2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderExample {
	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		System.out.print("입력: ");
		String lineString = br.readLine();
		//readline()메소드는 \r (캐리지리턴) 과 \n(줄바꿈)으로 구분된 행으로 문자를 읽어온다.
		
		
		System.out.println("출력: "+lineString);
		
	}
}
