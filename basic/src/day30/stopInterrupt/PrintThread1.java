package day30.stopInterrupt;

public class PrintThread1 extends Thread{
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	public void run() {
		while(!stop) {	//강제종료가 아니고 정상적이 종료를 유도하게 됨 (stop flag)
			System.out.println("실행중");
		}
		System.out.println("자원정리");	//stop이 true가 될 때 정리하고 종료
		System.out.println("실행종료");
	}
}
