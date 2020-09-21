package day38.IO2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutputsStreamExample {
	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("c:/Temp/Object.dat");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(new Integer(10));
		oos.writeObject(new Double(3.14));
		oos.writeObject(new int[] {1,2,3});
		oos.writeObject(new String("������"));
		
		oos.flush(); oos.close(); fos.close();
		
		FileInputStream fis = new FileInputStream("c:/Temp/Object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Integer obj1 = (Integer) ois.readObject();
		Double obj2 = (Double) ois.readObject();
		int[] obj3 = (int[]) ois.readObject();
		String obj4 = (String) ois.readObject();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3[0]+","+obj3[1]+","+obj3[2]);
		System.out.println(obj4);  
	}
}
