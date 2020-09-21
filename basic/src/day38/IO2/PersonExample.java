package day38.IO2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonExample {
	
	public static void main(String[] args) throws Exception{
		boolean run = true;
		String lineString = null;
		String onlyName=null;
		String onlyAddress =null;
		FileReader fr = new FileReader("D:\\JAVA01\\basic\\src\\day38\\IO2\\Person.txt");
		BufferedReader br = new BufferedReader(fr);
		Scanner scanner = new Scanner(System.in);


		List<Address> list = new ArrayList<Address>();
	
		while((lineString = br.readLine()) != null){
			String[] data = lineString.split(":"); 
			for(int i=0; i<data.length-1;i++) {
				onlyName = data[0];
				onlyAddress = data[1];
				Address adr = new Address();
				adr.name = data[0];
				adr.setLocation(data[1]);
				adr.getName();
				adr.getLocation();
				list.add(adr);
				
			}
		System.out.println();
		}
		fr.close();
			
			
		while(run) {
		System.out.println("항목을 선택하세요. (1.지역명  2.이름  3.종료) ");
		System.out.println("선택> ");
		int selectNo = scanner.nextInt();
		scanner.nextLine();
		
		
		if(selectNo == 1) {
			System.out.println("지역명을 입력하세요: ");
			String city = scanner.nextLine();
			
		
				
			

			
			
			
			
		}else if(selectNo ==2) {
			
			
			
			
		}else if(selectNo ==3) {
			run = false;
			
		}else {
			System.out.println("항목을 다시 선택하세요");
			
			System.out.println();
		}
	}
	System.out.println("프로그램 종료");
	run = false;
	
	}
	
}

