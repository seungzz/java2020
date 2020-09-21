package day29.Thread.wait;

public class ThreadA extends Thread{
	private WorkObject workObject;	//private·Î Ä¸½¶È­ ½ÃÅ´
	
	public ThreadA(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workObject.methodA();
		}
	}
	
	

}
