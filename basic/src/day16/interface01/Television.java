package day16.interface01;

public class Television implements RemoteControl{
	//�߻�Ŭ������ ���������� �������̽��� �ݵ�� �������̵� ���־�� �Ѵ�!
	//�ʵ�
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("��");
		
	}

	@Override
	public void turnOff() {
		System.out.println("��");
		
	}

	@Override
	public void setVolume(int Volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("���� TV����: "+this.volume);
			
		
	}

		
}
