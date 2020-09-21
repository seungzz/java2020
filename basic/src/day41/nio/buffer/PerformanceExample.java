package day41.nio.buffer;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.EnumSet;

public class PerformanceExample {
	public static void main(String[] args) throws Exception{
		Path from = Paths.get("src/day41/nio/buffer/fun.gif");
		Path to1 =  Paths.get("src/day41/nio/buffer/fun2.gif");
		Path to2 = Paths.get("src/day41/nio/buffer/fun3.gif");
		
		long size = Files.size(from);
		
		FileChannel fileChannel_from = FileChannel.open(from);
		FileChannel fileChannel_to1 = FileChannel.open(to1, EnumSet.of(StandardOpenOption.CREATE,
				StandardOpenOption.WRITE));
		FileChannel fileChannel_to2 = FileChannel.open(to1, EnumSet.of(StandardOpenOption.CREATE,
				StandardOpenOption.WRITE));
		
		ByteBuffer  nonDirectBuffer = ByteBuffer.allocate((int)size);
		ByteBuffer  directBuffer = ByteBuffer.allocateDirect((int)size);
		
		long start, end;
		start = System.nanoTime();
		for(int i=0; i<100; i++) {
			fileChannel_from.read(nonDirectBuffer);	//���� �����͸� ���ۿ� ����
			nonDirectBuffer.flip();	//���ۿ� ����Ǿ����� �����͸� �д� �޼ҵ�
			fileChannel_to1.write(nonDirectBuffer);	
			nonDirectBuffer.clear();	//���۸� ���� �޼ҵ�
		}
		end = System.nanoTime();
		System.out.println("�����̷�Ʈ: \t"+(end-start)+"nanoSecond");
		
		fileChannel_from.position(0);	//������ ��ġ�� ó������ �鸲
		
		start = System.nanoTime();
		for(int i=0; i<100; i++) {
			fileChannel_from.read(directBuffer);
			directBuffer.flip();
		}
		end = System.nanoTime();
		System.out.println("���̷�Ʈ: \t"+(end-start)+" ns");
		//���̷�Ʈ ���۴� Channel�� ����ؼ� ������ �����͸� �а� ������ �ü���� native I/O�� �����ϱ� ������ 
		//ä���� ������� �ʰ� get()/put()�� ����� ��쿡�� �� ���� ���� �ִ�.
		
		fileChannel_from.close();
		fileChannel_to1.close();
		fileChannel_to2.close();
	}
}