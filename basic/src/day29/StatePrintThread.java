package day29;

public class StatePrintThread extends Thread{
	private Thread targetThread;
	
	public StatePrintThread(Thread targetThread) {
		this.targetThread	 =  targetThread;
	}
	
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState();
			System.out.println("Ÿ�� ������ ����: "+state);
			
			if(state == Thread.State.NEW) {
				//NEW�� ���԰� �����Ŀ� start()�� ������� ���� ���
				
				targetThread.start();
			}
			
			if(state == Thread.State.TERMINATED){	//terminated�� ������ ��ģ ����
				break;
			}try {
			
				Thread.sleep(500);
			}catch(Exception e) {
				
			}
			//RUNNABLE -���� ���·� �������� �� �� �ִ� ����
			
			//-----��ٸ��� ����-----
			//WAITING  -�ٸ� �����尡 �����Ҷ����� ��ٸ��� ����
			//TIMED_WAITING  --�־��� �ð����� ��ٸ��� ����
			//BLOCKED  -����ϰ��� �ϴ� ��ü�� ���� Ǯ�������� ��ٸ��� ����
			//-------------------
		}
	}
	
}
