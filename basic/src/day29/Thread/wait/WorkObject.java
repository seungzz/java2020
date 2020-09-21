package day29.Thread.wait;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA의 methodA() 작업상황");
		notify();	//일시정지 상태에 있는 다른 스레드를 실행 대기 상태로 만드느 메소드
		
		try {
			wait();	//자신을 일시정지 상태로 만드는 메소드
		}catch (InterruptedException e) {}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadA의 methodB() 작업상황");
		notify();
		
		try {
			wait();
		}catch (InterruptedException e) {}
}
}