package day04;

public class IfElseIfElseExample {
	public static void main(String[] args) {
		int score = 75;
		
		if(score>=90) {
			System.out.println("점수가 100~90");
			System.out.println("등급은 A");
		} else if (score>=80) {
			System.out.println("점수가 80~90");
			System.out.println("등급은B");	
		} else if (score>=70) {
			System.out.println("점수가 70~80");
			System.out.println("등급은 C");
		} else if (score<70) {
			System.out.println("등급은 d");
			System.out.println("점수가70미만");
		}
	}

}
