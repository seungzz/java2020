package day30.demonThread;

public class DaemonExample {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();	//start를 하기 전에 setDaemon을 먼저 사용해서 데몬스레드를 설정해줘야 한다. 
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			
		}
		System.out.println("데몬인가"+autoSaveThread.isDaemon());
		//데몬스레드인지 아닌지 물어보는 메소드이다. 
		System.out.println("메인 스레드 종료");
	}
}
