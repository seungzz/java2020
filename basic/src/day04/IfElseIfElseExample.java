package day04;

public class IfElseIfElseExample {
	public static void main(String[] args) {
		int score = 75;
		
		if(score>=90) {
			System.out.println("������ 100~90");
			System.out.println("����� A");
		} else if (score>=80) {
			System.out.println("������ 80~90");
			System.out.println("�����B");	
		} else if (score>=70) {
			System.out.println("������ 70~80");
			System.out.println("����� C");
		} else if (score<70) {
			System.out.println("����� d");
			System.out.println("������70�̸�");
		}
	}

}
