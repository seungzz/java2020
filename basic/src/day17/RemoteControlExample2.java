package day17;

public class RemoteControlExample2 {
	public static void main(String[] args) {
		RemoteControl rc = null;
		
		//����Ʈ�޼ҵ�� �������̵��� ���� ���� �ʾƵ� ����� �� �ִ�. 
		rc = new Television();
		rc.turnOn();
		rc.setMute(true);
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
		
		RemoteControl.changeBattery();	//�����޼ҵ带 �������ұ� �����̴�.
		//�������̽��� �ܵ����� ��ü�� ���� �� ������ �����ִ� ����� .�� �� ����� �� �ִ�. 
		System.out.println("��������ȯ");
	}
}
