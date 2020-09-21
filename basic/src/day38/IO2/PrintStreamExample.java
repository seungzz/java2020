package day38.IO2;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("c:/Temp/file.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.println("[프린터보조소트림]");
		ps.print("마치");
		ps.println("프린트가 출력하는 것처럼");
		ps.println("데이터를 출력합니다.");
		
		ps.flush();
		ps.close();
		fos.close();
		
		
		
	}
}
