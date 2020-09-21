package day41.nio;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryExample {
	public static void main(String[] args) throws Exception	{
		Path path1 = Paths.get("C:/Temp/dir/subdir");
		Path path2 = Paths.get("C:/Temp/file.txt");
		
		if(Files.notExists(path1)) {
			Files.createDirectories(path1);
		}
		if(Files.notExists(path2)) {
			Files.createFile(path2);
		}
		
		Path path3 = Paths.get("c:Temp");
		DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path3);
		//디렉토리의 모든 내용을 스트림(반복자)으로 리턴 = Files.newDirecoryStream(path3)
		for(Path path : directoryStream) {
			if(Files.isDirectory(path)) {
			System.out.println("[디렉토리]"+path.getFileName());
		}else {
			System.out.println("[파일]"+path.getFileName()
			+"크기:"+Files.size(path)+")");
		}
	}
	
}
}