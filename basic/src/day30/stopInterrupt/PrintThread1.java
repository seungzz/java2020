package day30.stopInterrupt;

public class PrintThread1 extends Thread{
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	public void run() {
		while(!stop) {	//�������ᰡ �ƴϰ� �������� ���Ḧ �����ϰ� �� (stop flag)
			System.out.println("������");
		}
		System.out.println("�ڿ�����");	//stop�� true�� �� �� �����ϰ� ����
		System.out.println("��������");
	}
}
