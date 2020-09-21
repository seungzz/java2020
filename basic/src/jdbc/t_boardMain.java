package jdbc;

import java.util.Scanner;

public class t_boardMain {
	public static void main(String[] args) {
		
		t_boardDAO t_boardDao = new t_boardDAO();
		System.out.println("1.선택하기 2.삽입하기 3.갱신하기 4.삭제하기");
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while(run ) {
			System.out.println("1.선택하기 2.삽입하기 3.갱신하기 4.삭제하기");
			int select = sc.nextInt();
			switch(sc.nextLine()) {
			case "1" :
				t_boardDao.select();
				break;
			case "2" :
				t_boardDao.insert();
				break;
			case "3":
				t_boardDao.update();

				break;
			case "4":
				t_boardDao.delete();

				break;
			   }
			
			run = false;

		}
		

     
	}
	
	}

