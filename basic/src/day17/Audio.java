package day17;

public class Audio implements RemoteControl{
private int volume;
private boolean mute;
	@Override
	public void turnOn() {
		System.out.println("�������");
		
	}
//�������̽��� �׻� public �ٿ��־�� �Ѵ�!!
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
		System.out.println("���� Audio ����: "+this.volume);
			
		
	}
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("����� ����ó��");
		}else {
			System.out.println("���� ����");
		}
	}


}
