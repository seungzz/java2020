package day11;

public class Calculator {
	int plus(int x, int y) {
		int result = x+y;
		return result;
		
	}
	double avg(int x, int y ) {
		double sum = plus(x,y); //plus()메소드호출, 자동형변환해서 저장
		double result = sum/2;
		return result;
		
	}
	
	void execute() {
		double result = avg(7,10); //avg()메소드호출
		println("실행결과:" +result);
		
	}
	void println(String message) {
		System.out.println(message);
	}
}
//메소드 내에서도 메소드 호출이 가능함