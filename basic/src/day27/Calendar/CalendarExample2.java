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
		
		
		System.out.println("�׸��� �����ϼ���(1.����� ����  2. ������ ����  3. ������ ����  4.����)");
		
		int selectNo = scanner.nextInt(); // �����׸�
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
	System.out.println("���α׷��� �����մϴ�.");
}

private static void currentYearCalendar(Calendar date) {
	
	
}
	
}

