package day04;

public class AssignmentOperatorExample {
	public static void main(String[] args) {
		int result = 0;
		result +=10;	//result = result+10과 같은 의미
		System.out.println("result=" + result);
		result -=5;
		System.out.println("result =" +result);
		result *= 3;
		System.out.println("result =" +result);
		result /=5;
		System.out.println(result);
		result %=3;
		System.out.println(result);
		//자기자신과의 계산을 간단하게 표현하는 방법이다.
	}

}
