package day29;

public class ThreadC extends Thread{
	public boolean stop = false;
	public boolean work = true;
	
	public void run() {
		while(!stop) {	//stop�� true�� �Ǹ� while�� ����
			if(work) {
				System.out.println("ThreadC �۾� ����");
			}else {
			Thread.yield();		//work�� false�� �Ǹ� �ٸ� �����忡�� ���� �纸
			}
		}
		System.out.println("ThreadC ����");
	}

}
