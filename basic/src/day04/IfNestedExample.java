package day04;

public class IfNestedExample {
	public static void main(String[] args) {
		int score = (int)(Math.random()*20)+81;
		System.out.println("Á¡¼ö :" +score);
		
		String grade;
		
		if(score>=90) {
			if(score>=95) {
				grade = "A+";
		 	}else {
				grade = "A";
			} 
		}else { 
			
				if(score>=85) {
					grade =  "B+";
				}else {
					grade = "b";
				}
			}
			System.out.println(grade);
	}

	}
