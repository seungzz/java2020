package day38.IO2;

import java.io.BufferedReader;
import java.io.FileReader;

public class Test {
	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("D:\\JAVA01\\basic\\src\\day38\\IO2");
		BufferedReader br = new BufferedReader(fr);
		int readCharNo;
		
		char[] cbuf = new char[100];
		while((readCharNo=fr.read(cbuf))!=-1) {
			String lineString = br.readLine();
			System.out.println("Ãâ·Â: +"+lineString);
		}
		fr.close();
		
	}

}
