package Thread;

import java.io.File;
import java.io.FileWriter;

public class FileWriterExample {
	public static void main(String[] args) throws Exception{
		File file = new File("c:/Temp/file.txt");
		FileWriter fw = new FileWriter(file,true);
		//ture가 없을 경우 파일을 무조건 새로 만들게 된다.
		//true가 있을 경ㅇ우 파일을 덮었즤 않고 이에 내용을 추가한다.
		//new FileWriter(file) -> 파일이 존재해도 파일을 새로 만들어서 덮어씌우게 된다.
		//8-9 두줄의 코드를 한줄로 -> FileWriter fw = new FileWriter("c:/Temp/file.txt",true);
		
		
		fw.write("FileWriter는 한글로된" +"\r\n");
		fw.write("문자열을 바로 출력할 수 있다."+"\r\n");
		fw.flush();
		fw.close();
		System.out.println("파일이 저장되었습니다.");
	}
}
