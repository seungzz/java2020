package day42.nio.channel;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;

public class FileCopyExample {
	public static void main(String[] args) throws IOException {
		Path from = Paths.get("src/day42/nio/channel/fun.gif");
		
		Path to = Paths.get("src/day42/nio/channel/fun2.gif");
		
		FileChannel fileChannel_from = FileChannel.open(from, StandardOpenOption.READ);
		//�б� ���� ä�� ����
		
		FileChannel fileChannel_to = FileChannel.open(to, StandardOpenOption.CREATE,
				StandardOpenOption.WRITE);
		//���� ���� ä�� ����
		
		ByteBuffer buffer = ByteBuffer.allocateDirect(100);
		int byteCount;
		while(true) {
			buffer.clear();
			byteCount = fileChannel_from.read(buffer);
			if(byteCount ==-1 )break;
			buffer.flip();	//�ѹ� read�� ���������� position�� 0���� ����
			fileChannel_to.write(buffer);
		}
		
		fileChannel_from.close();
		fileChannel_to.close();
		System.out.println("���Ϻ������");
		
		
		Path from2 = Paths.get("c:/Temp/fun.gif");
		Path to2 = Paths.get("c:/Temp/fun4.gif");
		
		Files.copy(from2, to2, StandardCopyOption.REPLACE_EXISTING);
		//REPLACE_EXISTING ->Ÿ�������� �����ϸ� ��ü��
		//COPY_ATTRIBUTES ->������ �Ӽ����� ����
		//NOFOLLOW_LINKS -> ��ũ������ ��� ��ũ ���ϸ� �����ϰ� ��ũ�� ������ �������� �ʴ´�.
		System.out.println("���Ϻ��缺��");

	}
}
