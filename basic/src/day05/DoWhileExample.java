package day05;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		System.out.println("�޽����Է�");
		System.out.println("����� q");
		
		Scanner scanner = new Scanner(System.in);
		
		String inputString;
		
		do {
			System.out.println(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		}while(inputString.equals("q")); //while���� ���ư��� ���� �ѹ��� �ϴ� ���� ������ ������ do
		
		System.out.println();
		System.out.println("���α׷�����");
		}
		
	}

