package day27.Calendar;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarExample2 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Calendar date = Calendar.getInstance();
	date.set(Calendar.YEAR, 2020);
	date.set(Calendar.MONTH,5 );
	date.set(Calendar.DATE, 1);
	
	
	boolean run = true;
	
	while (run) {
		
		
		System.out.println("항목을 선택하세요(1.현재달 보기  2. 이전달 보기  3. 다음달 보기  4.종료)");
		
		int selectNo = scanner.nextInt(); // 선택항목
		scanner.nextLine();

		if (selectNo == 1) {
			currentYearCalendar(date);
			
			
			
		
			//lastYearCalendar(date);

		} else if (selectNo == 2) {
		
		}else if(selectNo ==3) {
			
		} else if (selectNo == 4) {
			run = false;
		}
	}
	System.out.println("프로그램을 종료합니다.");
}

private static void currentYearCalendar(Calendar date) {
	
	
}
	
}

