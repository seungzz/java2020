package day38.IO2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {
	public static void main(String[] args) throws Exception{
		long start =0;
		long end =0;
		
		FileInputStream fis1 = new FileInputStream("D:\\JAVA01\\basic\\src\\day38\\IO2\\17.jpg");
		start = System.currentTimeMillis();

		while(fis1.read() !=-1) {}
		end = System.currentTimeMillis();
		System.out.println("사용하지 않았을때 : "+(end-start)+"ms");
		fis1.close();
		
		FileInputStream fis2 = new FileInputStream("D:\\JAVA01\\basic\\src\\day38\\IO2\\17.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		start = System.currentTimeMillis();
		end = System.currentTimeMillis();

		System.out.println("버퍼를 사용했을때"+(end-start)+"ms");
		bis.close();
		fis2.close();

	}
}
