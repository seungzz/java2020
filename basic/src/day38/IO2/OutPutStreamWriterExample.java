package day38.IO2;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutPutStreamWriterExample {
	public static void main(String[] args) throws Exception	{
		FileOutputStream fos = new FileOutputStream("c:/Temp/file.txt");
		
		Writer writer = new OutputStreamWriter(fos);
		
		String data = "����Ʈ ��� ��Ʈ�� ���� ��� ��Ʈ������ ��ȯ";
		writer.write(data);
		
		writer.flush();
		writer.close();
	}
}
