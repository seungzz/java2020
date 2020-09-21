package day03;

public class CharOperationExample {
	public static void main(String[] args) {
		char c1 = 'A'+1;		// '= 뒤에' 변수를 쓰지 않고 연산을 하면 int가 되지 않는다.
		char c2 = 'A';		
		//char c3 = c2+1;   -> 컴파일 에러 연산값은 int로 나오기 때문이다!!!
		
		System.out.println("c1 :"+ c1);
		System.out.println("c2 :" +c2);
		
		
	}

}
