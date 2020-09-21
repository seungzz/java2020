package day19;

public class CatchOrderExample {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[0];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1+"+"+data2+"="+result);
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("부족");
		}catch(Exception e ) {	//exception은 모든 예외를 처리할 수 있는 가장 상위에있는 예외이다.
			System.out.println("실행에 문제 있다");
		}finally {
			System.out.println("다시실행");
		}
	}
}
