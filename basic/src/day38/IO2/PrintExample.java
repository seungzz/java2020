package day38.IO2;

public class PrintExample {
	public static void main(String[] args) {
		System.out.printf("상품의가격: %d원\n", 123);
		System.out.printf("상품의 가격: %6d원\n",123);
		//%6d는 여섯자리, 남는 공간은 빈공간
		System.out.printf("상품의 가격: %06d원\n",123);
		//%06d는 여섯자리, 남는 공간은 0으로 채워준다.
		System.out.printf("상품의 가격: %-6d원\n",123);
		//여섯자리, 오른쪽을 빈 공간으로 한다. 
		
		
		System.out.printf("반지름이%d인 원의 넓이: %10.2f\n",10,Math.PI*10*10);
		//전체 자리수 10자리 (소숫점 자리수제외 7자리) 소숫점 자리수 2자리 왼쪽 빈자리 공백
	}
}
