package day29;

public class YieldExample {
	public static void main(String[] args) {
		ThreadC threadC = new ThreadC();
		ThreadD threadD = new ThreadD();
		
		threadC.start();
		threadD.start();
		
		try {Thread.sleep(3000);} catch(InterruptedException e) {}
		threadC.work = false;	//threadD�� ����
		
		try {Thread.sleep(3000);} catch(InterruptedException e) {}
		threadC.work = true;	//thread C�� D ��� ����
		
		try {Thread.sleep(3000);} catch(InterruptedException e) {}
		threadC.stop = true; //threadC��D����
		threadD.stop = true;
		}
		
	}

