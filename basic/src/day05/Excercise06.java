package day05;

import java.util.Scanner;

public class Excercise06 {
	public static void main(String[] args)  {
		int balance = 0;
		int keycode =0;
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		
		while(run) { 
		System.out.println("------------------");
		System.out.println("1.���� | 2.��� | 3.�ܰ�  | 4.����");
	    System.out.println("------------------");
		
	    int menuNum = scanner.nextInt();
	    switch(menuNum) {
	    	case 1: 
	    		System.out.print("���ݾ�>");
	    		balance += scanner.nextInt();
	    		break;
	    	case 2:
	    		System.out.print("��ݾ�>");
	    		balance -= scanner.nextInt();
	    		break;
	    	case 3:
	    		System.out.println("�ܰ�>");
	    		System.out.println(balance);
	    		break;
	    	case 4:
	    		run = false;
	    		break;
	    }System.out.println();
	    
		}
			
			
	}
		
	}


