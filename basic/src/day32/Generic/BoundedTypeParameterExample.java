package day32.Generic;

public class BoundedTypeParameterExample {
	public static void main(String[] args) {
		//String str = Util.compare("A", "b");
		//String은 Number 타입이 아니기 때문에 사용불가
		
		int result = Util.compare(10, 20);
		System.err.println(result);
		
		int result2 = Util.compare(4.5, 3);
		System.out.println(result2);
	}
}
