package jdbc.ex;

import java.util.Scanner;

public class Mini_Main {
	public static void main(String[] args) {
		MiniDAO miniDAO = new MiniDAO();
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while(run) {
			System.out.println("1.선택하기 2.삽입하기 3.갱신하기 4.삭제하기");
			System.out.println("선택>>");
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
