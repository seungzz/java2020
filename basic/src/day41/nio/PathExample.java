package day41.nio;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

public class PathExample {
	public static void main(String[] args) throws Exception{
		Path path = Paths.get("src/day41/nio/PathExample.java");
		
		System.out.println("[파일명] "+path.getFileName());
		System.out.println("부모 디렉토리명]"+path.getParent());
		System.out.println("중첩 경로수: "+path.getNameCount());
		
		System.out.println();
		for(int i=0; i<path.getNameCount(); i++) {
			System.out.println(path.getNameCount());
		}
		
		System.out.println();
		Iterator<Path> iterator = path.iterator();
		while(iterator.hasNext()) {
			Path temp = iterator.next();
			System.out.println(temp.getFileName());
		}
		
	}
}
