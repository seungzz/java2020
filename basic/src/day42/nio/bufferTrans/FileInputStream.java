package day42.nio.bufferTrans;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileInputStream {
	public static void main(String[] args)	throws IOException {
		Path path = Paths.get("c:/Temp/file.txt");
		Files.createDirectories(path.getParent());
		//�θ� ������ ��� ����
		
		FileInputStream fis = new FileInputStream("c:/Temp");
		FileChannel fileChannel0 = fis.getChannel();
		
		FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.CREATE,StandardOpenOption.WRITE);
		//open()�޼ҵ带 ���ؼ� �������� �ֽ��ϴ�.
		//create -> ������ ������ ���� ����
		//write -> ��������� ������ ����.
		//read -> �б������ ������ ����.
		//create_new -> �� ������ �����. �̹� �ĤӤ��� ������ ���ܿ� �Բ� ����
		//append -> ���� ���� ���ο� �����͸� �߰��Ѵ�. write�� create�� �Բ� ���
		//delete_on_close -> ä���� ������ ������ �����Ѵ�.
		
		
		String data = "�ȳ��ϼ���~";
		Charset charset = Charset.defaultCharset();
		ByteBuffer byteBuffer = charset.encode(data);
		
		int byteCount = fileChannel.write(byteBuffer);
		System.out.println("file.txt: "+byteCount +"bytes writter");
		
		fileChannel.close();
	}
}
