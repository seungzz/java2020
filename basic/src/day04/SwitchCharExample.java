package day04;

public class SwitchCharExample {
	public static void main(String[] args) {
		char grade = 'B';  //당연히 스트링도 들어가겠지?
		
		switch(grade) {
		case 'A':
		case 'a': 
			System.out.println("우수회원");
			break;
		case 'B':
		case 'b':
			System.out.println("일반회원");
			break;
		default :
			System.out.println("손님입니다.");
		}
	}

}
