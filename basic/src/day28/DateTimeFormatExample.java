package day28;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class DateTimeFormatExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
//		Calendar c = Calendar.getInstance();
//		Date d = new Date();
		
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy�� M�� d�� a h�� m��");
		String nowString = now.format(dateTimeFormatter);
		System.out.println(nowString);
				
	}
}
