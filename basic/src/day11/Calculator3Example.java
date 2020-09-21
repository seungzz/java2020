package day11;

public class Calculator3Example {
	public static void main(String[] args) {
			double result1  = 10*10*Calculator3.pi;
			int result2 = Calculator3.plus(10, 5);
			int result3 = Calculator3.minus(10, 5);
			
			//Calculator를 static으로 만들어줬기 때문에 new 선언 안해줘도 된다. 
			//메모리에 우선 올라가기 때문에 메모리 사용량이 올라간다. -> 너무 남발하면 안된다. 
			
			
			
			
			System.out.println("result1 :" +result1);
			System.out.println("result2 :" +result2);
			System.out.println("result3 :" +result3);
		
	}
}
