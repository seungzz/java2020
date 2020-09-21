package day38.IO2;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;

public class SerializableWriter {
	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("c:/Temp/Object.dat");
		
		ObjectInputStream oos = new ObjectInputStream(fos);
		
		ClassA classA = new ClassA();
		classA.field = 1;
		classA.field2.field1 =2;
		classA.field3 =3;
		classA.field4 = 4;
		
		oos.writeObject(classA);
		oos.flush(); oos.close(); fos.close();
		
	}
}
