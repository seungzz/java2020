package day30.stopInterrupt;

public class InterruptExample {
	public static void main(String[] args) {
		Thread thread = new PrintThread2();
		thread.start();
		
		try {Thread.sleep(1000);} catch(InterruptedException e ) {}
		
		thread.interrupt(); 	//InterruptException을 발생시켜서 스레드 종료
		
		
		System.out.println("isInterrupted(): "+ thread.isInterrupted() );;
		//isinterrupted()는 인스턴스 메소드로 객체를 만들고 사용이 가능하다.
	}
}
