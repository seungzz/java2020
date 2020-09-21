package day30.ThreadGroup;

public class ThreadGroupExample {
	public static void main(String[] args) {
		ThreadGroup myGroup	= new ThreadGroup("myGroup");
		//������ �׷� �̸��� myGroup���� ����
		
		
		//myGroup�� workThread1,workThread2�߰�
		WorkThread workThread1 = new WorkThread(myGroup,"workThread1");
		WorkThread workThread2 = new WorkThread(myGroup, "workThread2");
		
		workThread1.start();
		workThread2.start();
		
		System.out.println("[ main ������ �׷��� list() �޼ҵ� ��� ���� ]");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		//���� �׷��� ������ �����
		
		mainGroup.list();
		System.out.println();
		
		try {Thread.sleep(3000);} catch(InterruptedException e ) {}
		System.out.println("[myGroup ������ �׷��� interript() �޼ҵ� ȣ��]");
		myGroup.interrupt();
			
		}
	}

