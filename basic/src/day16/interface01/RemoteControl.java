package day16.interface01;

public interface RemoteControl {
	//�������̽��� �Ϲ������� ������ �������� ������ ����� �� �� �ִ�.
	//�������̽��� �ܵ����� ��밡��
	int MAX_VOLUME =10;
	int MIN_VOLUME =0;
	
	void turnOn();
	void turnOff();
	void setVolume(int Volume);
	
	
	
	//����Ʈ�޼ҵ�, �Ϲ� �޼ҵ�ó�� ����� �� �ִ�.(�ڹ�8���� �߰���)
	default void setMute(boolean mute) {
		if(mute)	{
			System.out.println("����");
			
		}else {
			System.out.println("��������");
		}
	}
	
	static void changeBattery() {
		System.out.println("��������ȯ");
	}
}
