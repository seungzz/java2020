package day38.IO2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception{
		String filePath = "D:\\JAVA01\\basic\\src\\day38\\IO2\\ClassA.java";

		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		int rowNumber = 0;
		String rowData;
		
		while((rowData=br.readLine()) !=null) {
			System.out.println(++rowNumber+":"+rowData);
		}
		
	}
}