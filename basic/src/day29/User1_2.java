package day29;

public class User1_2 extends Thread{
	private Calculator2 calculator;
	
	public void setCalculator(Calculator2 calculator) {
		this.setName("User1");	//������ �̸��� user1���� ����
		this.calculator = calculator;	//������ü�� calculator�� �ʵ忡 ����
		
	}
	
	public void run() {
		calculator.setMemory(100);	//������ü�� Calculator�� �޸𸮿� 100 ����
		
	}

}


