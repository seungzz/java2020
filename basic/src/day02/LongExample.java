package day02;

public class LongExample {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;	//꼭 int보다 큰 숫자가 아니더라도 바로 long으로 표시할 수 있다.
		//long var3 = 10000000000; 컴파일 에러. 기본은 숫자를 int로 인식하기 때문이다.
		long var4 = 10000000000L;
		
		System.out.println(var1);
		System.out.println(var2);	
		System.out.println(var4);
	}

}
