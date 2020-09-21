package day16.interface01;

public class Television implements RemoteControl{
	//추상클래스와 마찬가지로 인터페이스도 반드시 오버라이딩 해주어야 한다!
	//필드
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("켬");
		
	}

	@Override
	public void turnOff() {
		System.out.println("끔");
		
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
		System.out.println("현재 TV볼륨: "+this.volume);
			
		
	}

		
}
