package day30.stopInterrupt;

public class PrintThread2 extends Thread{
	public void run() {
//		try {
//			while(true) {
//				System.out.println("실행중");
//				Thread.sleep(1);
//			}
//		}catch(InterruptedException e) {}
		
		
		
		
		
		
		while(true) {			//Thread.sleep를 사용하거나 혹은 Thread.interrupted()를 사용해서 
								//Interrupt가 발생했는지
			System.out.println("실행중");
			if(Thread.interrupted()) {
				break;
			}
		}
		System.out.println("자원정리");
		System.out.println("실행종료");
	}
}
