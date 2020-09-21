package day29;

public class JoinExample {
	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		try {
			sumThread.join();	//계산이 끝날때까지 기다려줌
			
		}catch (InterruptedException e) {}
		System.out.println("1~100합: "+sumThread.getSum());
	}
}
