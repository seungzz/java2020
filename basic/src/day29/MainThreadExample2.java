package day29;

public class MainThreadExample2 {
	public static void main(String[] args) {
		Calculator2 calculator = new Calculator2();
		
		User1_2 user1 = new User1_2();
		user1.setCalculator(calculator);
		user1.start();	//������ ���ÿ� �Ѵٰ� �ϴ� ���� �ƴϰ� ��⿭�� �÷��δ°�. 
						//run()->������ ���ÿ� �Ѵ�
		
		User2_2 user2 = new User2_2();
		user2.setCalculator(calculator);
		user2.start();
	}
}