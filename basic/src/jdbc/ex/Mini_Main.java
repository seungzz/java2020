package jdbc.ex;

import java.util.Scanner;

public class Mini_Main {
	public static void main(String[] args) {
		MiniDAO miniDAO = new MiniDAO() {
			
			@Override
			public void register() throws Exception {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void modify() throws Exception {
				// TODO Auto-generated method stub
				
			}
		};
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("1.선택하기 2.삽입하기 3.갱신하기 4.삭제하기 5.종료");
			System.out.println("선택>>");

			int selectNo = sc.nextInt();
			if (selectNo == 1) {
				miniDAO.select();
			} else if (selectNo == 2) {
				miniDAO.insert();
			} else if (selectNo == 3) {
				miniDAO.update();
			} else if (selectNo == 4) {
				miniDAO.delete();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("종료되었습니다.");
	}

}
