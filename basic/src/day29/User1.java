package day29;

public class User1 extends Thread{
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User1");	//스레드 이름을 user1으로 지정
		this.calculator = calculator;	//공유객체인 calculator를 필드에 저장
		
	}
	
	public void run() {
		calculator.setMemory(100);	//공유객체인 Calculator의 메모리에 100 저장
		
	}

}
