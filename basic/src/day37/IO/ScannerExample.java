package day37.IO;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���ڿ��Է�> ");
		String inputString = scanner.nextLine();
		System.out.println(inputString);
		System.out.println();
		
		System.out.print("�����Է�>");
		int inputInt = scanner.nextInt();
		System.out.println(inputInt);
		System.out.println();
		
		System.out.println("�Ǽ��Է�>");
		double inputDouble = scanner.nextDouble();
		System.out.println(inputDouble);
		System.out.println();
	}
}
