package day01;

public class literalTest {
	public static void main(String[] args) {
		//0, 75, -100 소숫점이 없는 정수 리터럴
		//byte, char, short, int, long 에 저장이 된다.
		
		double d2= 2E3;
		System.out.println(d2);
		double d3 = 2E-10;
		System.out.println(d3);
		//문자 리터럴
		char c3= '\t'; //  \t는 탭(넓게 띄어쓰기) \n = 줄바꿈
		
		//문자열 리터럴 -> ㅋ""로 묶은 텍스트. 큰따옴표 안에는 텍스트가 없어도 문자열 리터럴로 간주.
		System.out.println("      z");
		//문자열 리터럴 내부에서도 이스케이프 문자를 사용가능하다.
		
		String s = "대한민국";
		String s2 = "탭만큼 이동 \t 합니다.";
		String s3 = "한줄 내려쓰기 \n 합니다.";
		System.out.println(s);
		System.out.println(s2);
		System.out.println(s3);
		
		
		//논리 리터럴
		//true와 false는 논리 리터럴로 가정한다.
		boolean bool = true;
		boolean bool2 = false;
		System.out.println(bool);
		System.out.println(bool2);
		
		
	}

}
