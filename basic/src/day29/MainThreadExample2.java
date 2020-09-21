package day29;

public class MainThreadExample2 {
	public static void main(String[] args) {
		Calculator2 calculator = new Calculator2();
		
		User1_2 user1 = new User1_2();
		user1.setCalculator(calculator);
		user1.start();	//실행을 동시에 한다고 하는 것이 아니고 대기열에 올려두는것. 
						//run()->실행을 동시에 한다
		
		User2_2 user2 = new User2_2();
		user2.setCalculator(calculator);
		user2.start();
	}
}