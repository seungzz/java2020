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
			System.out.println("1.�����ϱ� 2.�����ϱ� 3.�����ϱ� 4.�����ϱ� 5.����");
			System.out.println("����>>");

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
		System.out.println("����Ǿ����ϴ�.");
	}

}
