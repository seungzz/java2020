package Thread;

import java.io.File;
import java.io.FileWriter;

public class FileWriterExample {
	public static void main(String[] args) throws Exception{
		File file = new File("c:/Temp/file.txt");
		FileWriter fw = new FileWriter(file,true);
		//ture�� ���� ��� ������ ������ ���� ����� �ȴ�.
		//true�� ���� �椷�� ������ �����p �ʰ� �̿� ������ �߰��Ѵ�.
		//new FileWriter(file) -> ������ �����ص� ������ ���� ���� ������ �ȴ�.
		//8-9 ������ �ڵ带 ���ٷ� -> FileWriter fw = new FileWriter("c:/Temp/file.txt",true);
		
		
		fw.write("FileWriter�� �ѱ۷ε�" +"\r\n");
		fw.write("���ڿ��� �ٷ� ����� �� �ִ�."+"\r\n");
		fw.flush();
		fw.close();
		System.out.println("������ ����Ǿ����ϴ�.");
	}
}
