package day27.Calendar;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarExample {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calendar date = Calendar.getInstance(); // Calendar ��ü ����
		
		boolean run = true;
		
		while (run) {
			
			
			System.out.println("�׸��� �����ϼ���(1.Ư���⵵ ��¥���� 2. Ư���� ��¥���� 3. ����)");
			
			int selectNo = scanner.nextInt(); // �����׸�
			scanner.nextLine();

			if (selectNo == 1) {

				System.out.println("�⵵�� �Է��ϼ���: ");
				int a = scanner.nextInt();
				
				date.set(Calendar.YEAR, a);
				date.set(Calendar.MONTH,0 );
				date.set(Calendar.DATE, 1);
				yearCalendar(date);

			} else if (selectNo == 2) {
				System.out.println("�⵵�� �Է��ϼ���: ");
				int b = scanner.nextInt();
				scanner.nextLine();
				System.out.println("���� �Է��ϼ���: ");
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
		System.out.println("���α׷��� �����մϴ�.");
	}

	private static void yearCalendar(Calendar date) {

		for (int i = 0; i <12; i++) {
			System.out.println(date.get(Calendar.YEAR) + "�� " + (date.get(Calendar.MONTH)+1) + "��");
			System.out.println("----------------------------------------------------");
			System.out.println("��\t��\tȭ\t��\t��\t��\t��");
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
		
		System.out.println(date.get(Calendar.YEAR) + "�� " + (date.get(Calendar.MONTH)+1) + "��");
		System.out.println("----------------------------------------------------");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
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

