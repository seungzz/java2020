package day37.IO;

import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
	public static void main(String[] args) throws Exception{
		File dir = new File("c:/Temp/dir");
		File file1 = new File("c:/Temp/file1.txt");
		File file2 = new File("c:/Temp/file2.txt");
		File file3 = new File(new URI("flie:///c:/Temp/file3.txt"));
		//파일을 URI객체로 생성해서 매개값으로 제공해도 생성가능
		
		if(dir.exists() ==false) {dir.mkdirs();}
		//exists()는 실제로 파일이나 디렉토리가 존재하는지 확인
		if(file1.exists() ==false) {file1.createNewFile();}
		if(file2.exists() ==false) {file2.createNewFile();}
		if(file3.exists() ==false) {file3.createNewFile();}

		File temp = new File("c:/Temp");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		File[] contents = temp.listFiles();
		//listFiles()는 디렉토리에 포함된 서브 디렉터리 목록 전부를 File배열로 반환
		
		
		System.out.println("날짜\t\t시간\t형태\t크기\t이름");
		System.out.println("--------------------------------------------------------------");
		
		for(File file : contents) {
			System.out.println(sdf.format(new Date(file.lastModified())));
		if(file.isDirectory()) {
		System.out.println("\t<DIR>\t\t\t"+file.getName());	
		}else {
			System.out.println("\t\t\t"+file.length()+"\t"+file.getName());
		}System.out.println();
		}
	}
	
}
