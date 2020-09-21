package day29;

public class TargetThread extends Thread{
	public void run() {
		for(long i =0; i<10000000000L;i++) {
			
		}try {
			//1.5초간 일시정지
			Thread.sleep(1500);
		}catch(Exception e) {
			
		}
		for(long i=0;i<10000000000L;i++) {
			
		}
	}

}
