package jdbc.ex;

import java.util.Scanner;

public class Mini_Main {
	public static void main(String[] args) {
		MiniDAO miniDAO = new MiniDAO();
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while(run) {
			System.out.println("1.�����ϱ� 2.�����ϱ� 3.�����ϱ� 4.�����ϱ�");
			System.out.println("����>>");
			switch(sc.nextLine()){
			case "1" :
				miniDAO.select();
				break;
			case "2" :
				miniDAO.insert();
				break;
			case "3" :
				miniDAO.update();
				break;
			case "4" :
				miniDAO.delete();
				break;
			
			} run = false;
		}
	}
}
