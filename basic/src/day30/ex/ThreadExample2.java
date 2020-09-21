package day30.ex;

public class ThreadExample2 {
	public static void main(String[] args) {
		Thread thread = new MovieThread2();
		//작성위치
		thread.start();
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {}
		thread.interrupt();
	}
}


