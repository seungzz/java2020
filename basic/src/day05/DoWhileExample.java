package day05;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		System.out.println("메시지입력");
		System.out.println("종료는 q");
		
		Scanner scanner = new Scanner(System.in);
		
		String inputString;
		
		do {
			System.out.println(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		}while(inputString.equals("q")); //while문이 돌아가기 전에 한번은 일단 먼저 돌리자 했을때 do
		
		System.out.println();
		System.out.println("프로그램종료");
		}
		
	}

