package day30.stopInterrupt;

public class StopFlagExample {
	public static void main(String[] args) {
		PrintThread1 printThread = new PrintThread1();
		printThread.start();
		
		try {Thread.sleep(3000); }catch (InterruptedException e) {}
		
		printThread.setStop(true); //스레드 종료를 위해 stop을 true로 변경
		
		}
	}

