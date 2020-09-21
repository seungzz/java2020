package day27.Calendar;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarExample {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calendar date = Calendar.getInstance(); // Calendar 객체 생성
		
		boolean run = true;
		
		while (run) {
			
			
			System.out.println("항목을 선택하세요(1.특정년도 날짜보기 2. 특정월 날짜보기 3. 종료)");
			
			int selectNo = scanner.nextInt(); // 선택항목
			scanner.nextLine();

			if (selectNo == 1) {

				System.out.println("년도를 입력하세요: ");
				int a = scanner.nextInt();
				
				date.set(Calendar.YEAR, a);
				date.set(Calendar.MONTH,0 );
				date.set(Calendar.DATE, 1);
				yearCalendar(date);

			} else if (selectNo == 2) {
				System.out.println("년도를 입력하세요: ");
				int b = scanner.nextInt();
				scanner.nextLine();
				System.out.println("월을 입력하세요: ");
				int c = scanner.nextInt();
				scanner.nextLine();
				date.set(Calendar.YEAR, b);
				date.set(Calendar.MONTH,c-1 );
				date.set(Calendar.DATE, 1);
				monthCalendar(date);
				
			} else if (selectNo == 3) {
				run = false;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}

	private static void yearCalendar(Calendar date) {

		for (int i = 0; i <12; i++) {
			System.out.println(date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH)+1) + "월");
			System.out.println("----------------------------------------------------");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			System.out.println("----------------------------------------------------");
			
			
			for(int j=1; j<date.get(Calendar.DAY_OF_WEEK); j++) {
				System.out.print("\t");
				}
			
			

			while(true) {
				
			
				System.out.print(date.get(Calendar.DATE)+"\t");
				
				if(date.get(Calendar.DAY_OF_WEEK)%7==0) {
					System.out.println();
				}
				date.add(Calendar.DATE,1);
				if(date.get(Calendar.DATE)==1) {
					break;
				}
			}
			
			System.out.println();
			System.out.println();
			
			}


		}
		
	private static void monthCalendar(Calendar date) {
		
		System.out.println(date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH)+1) + "월");
		System.out.println("----------------------------------------------------");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("----------------------------------------------------");
		for(int j=1; j<date.get(Calendar.DAY_OF_WEEK); j++) {
			System.out.print("\t");
			}
		while(true) {
			
			
			System.out.print(date.get(Calendar.DATE)+"\t");
			
			if(date.get(Calendar.DAY_OF_WEEK)%7==0) {
				System.out.println();
			}
			date.add(Calendar.DATE,1);
			if(date.get(Calendar.DATE)==1) {
				break;
			}
		}
		System.out.println();
		System.out.println();
	}
	
	}

