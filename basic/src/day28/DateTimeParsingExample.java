package day28;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeParsingExample {
	public static void main(String[] args) {
	//파싱:필요없는 데이터를 버리고 필요한 데이터를 취하는것
		
		DateTimeFormatter formatter;
		LocalDate localDate;
		
		localDate = LocalDate.parse("2024-05-21");
		System.out.println(localDate);
		
		formatter = DateTimeFormatter.ISO_LOCAL_DATE;
		localDate = LocalDate.parse("2024-05-21",formatter);
		System.out.println(localDate);
		
		
		formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");	//이 형식으로 파싱을 하겠다. 
		localDate = LocalDate.parse("2024/05/21", formatter);
		System.out.println(localDate);
		
	}
}
