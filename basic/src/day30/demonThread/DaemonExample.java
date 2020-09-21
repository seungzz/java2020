package day30.demonThread;

public class DaemonExample {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();	//start�� �ϱ� ���� setDaemon�� ���� ����ؼ� ���󽺷��带 ��������� �Ѵ�. 
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			
		}
		System.out.println("�����ΰ�"+autoSaveThread.isDaemon());
		//���󽺷������� �ƴ��� ����� �޼ҵ��̴�. 
		System.out.println("���� ������ ����");
	}
}
