package day38.IO2;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerializableReader {
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("c:/Temp/Object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ClassA v = (ClassA) ois.readObject();
		System.out.println("field1 : "+v.field);
		System.out.println("field2.field1 : "+v.field2.field1);
		System.out.println("field3 : "+v.filed3);
		System.out.println("field4 : "+v.field4);
	}
}
