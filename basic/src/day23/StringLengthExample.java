package day23;

public class StringLengthExample {
	public static void main(String[] args) {
		String ssn = "730624-1230123";
		
		int length = ssn.length();
		if(length == 14) {
			System.out.println("자리수가맞다");
			
		}else {
			System.out.println("자리수틀리다");
		}
	}
}
