package day16.interface01;

public class Audio implements RemoteControl{
private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("켬");
		
	}
//인터페이스는 항상 public 붙여주어야 한다!!
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
		System.out.println("현재 Audio 볼륨: "+this.volume);
			
		
	}


}
