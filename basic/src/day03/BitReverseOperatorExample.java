package day03;

public class BitReverseOperatorExample {
	public static void main(String[] args) {
		//비트를 뒤집어야 하는 경우를 쓸 때 사용한다. int short byte long에 사용할 수 있다.
		//00000000 ->11111111 
		int v1 = 10;
		int v2 = -v1;
		int v3 = ~v1 +1; //반전하고 +1한다면 부호가 바뀐다.
		
		System.out.println("(십진수 :" + v1+ ")");
		System.out.println("(십진수 :" + v2+ ")");
		System.out.println("(십진수 :" + v3+ ")");
		
		int v4 = -10;
		int v5 = ~v4;
		int v6 = ~v4+1;
		System.out.println("(십진수 :" + v4+ ")");
		System.out.println("(십진수 :" + v5+ ")");
		System.out.println("(십진수 :" + v6+ ")");
	}

}
