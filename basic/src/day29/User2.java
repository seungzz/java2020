package day29;

public class User2 extends Thread{
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User2");	//������ �̸��� user1���� ����
		this.calculator = calculator;	//������ü�� calculator�� �ʵ忡 ����
		
	}
	
	public void run() {
		calculator.setMemory(100);	//������ü�� Calculator�� �޸𸮿� 100 ����
		
	}

}

