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
			System.out.println("1.�л��� | 2. �̸��Է� | 3.�л�����Ʈ | 4.����");
			System.out.println("----------------------------------------------");
			System.out.print("����> ");

			
			int selectNo = scanner.nextInt();
			if(selectNo==1) {
				
				System.out.print("�л���> ");
				 studentNum =scanner.nextInt();
				 names = new String[studentNum];
				 System.out.println("�л�����" +studentNum);
				 
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
		System.out.println("���α׷� ����");
		}
	}

