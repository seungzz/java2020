package day38.IO2;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerialVersionUIDExample2 {		//역직렬화
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("c:/Temp/Object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ClassC classC = (ClassC) ois.readObject();
		System.out.println("field1 : "+classC.field1);
		System.out.println("field2 : "+classC.field2);
		
		
	}
}
