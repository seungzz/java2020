package day38.IO2;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("c:/Temp/file.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.println("[�����ͺ�����Ʈ��]");
		ps.print("��ġ");
		ps.println("����Ʈ�� ����ϴ� ��ó��");
		ps.println("�����͸� ����մϴ�.");
		
		ps.flush();
		ps.close();
		fos.close();
		
		
		
	}
}
