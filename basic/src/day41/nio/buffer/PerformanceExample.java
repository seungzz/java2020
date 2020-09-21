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
			fileChannel_from.read(nonDirectBuffer);	//읽은 데이터를 버퍼에 저장
			nonDirectBuffer.flip();	//버퍼에 저장되엉ㅆ는 데이터를 읽는 메소드
			fileChannel_to1.write(nonDirectBuffer);	
			nonDirectBuffer.clear();	//버퍼를 비우는 메소드
		}
		end = System.nanoTime();
		System.out.println("논다이렉트: \t"+(end-start)+"nanoSecond");
		
		fileChannel_from.position(0);	//파일의 위치를 처음으로 들림
		
		start = System.nanoTime();
		for(int i=0; i<100; i++) {
			fileChannel_from.read(directBuffer);
			directBuffer.flip();
		}
		end = System.nanoTime();
		System.out.println("다이렉트: \t"+(end-start)+" ns");
		//다이렉트 버퍼는 Channel을 사용해서 버퍼의 데이터를 읽고 쓸때만 운영체제의 native I/O를 수행하기 때문에 
		//채널을 사용하지 않고 get()/put()을 사용할 경우에는 더 느릴 수도 있다.
		
		fileChannel_from.close();
		fileChannel_to1.close();
		fileChannel_to2.close();
	}
}
