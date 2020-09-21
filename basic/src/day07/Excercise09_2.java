package day07;

import java.util.Scanner;

public class Excercise09_2 {


	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		String[] names = null;

		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2. 이름입력 | 3.학생리스트 | 4.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택> ");

			
			int selectNo = scanner.nextInt();
			if(selectNo==1) {
				
				System.out.print("학생수> ");
				 studentNum =scanner.nextInt();
				 names = new String[studentNum];
				 System.out.println("학생수는" +studentNum);
				 
			}else if(selectNo ==2) {
				for(int i =0; i<names.length; i++) {
					System.out.println("name["+i+"]");
					 names[i] = scanner.nextLine();
					 scanner.nextLine();
					 
				
				}
				
			}else if(selectNo ==3) {
				for(int i =0; i<names.length; i++) {
					System.out.println(names[i]);
				}
				
				
				
			}else if(selectNo ==4) {
				run = false;
				
			}
			}
		System.out.println("프로그램 종료");
		}
	}

