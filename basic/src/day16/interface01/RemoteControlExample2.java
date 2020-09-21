package day16.interface01;

public class RemoteControlExample2 {
	public static void main(String[] args) {
		//익명 구현객체
		//따로 구현 객체를 만들지 않고 바로 사용할 수 있도록 추상메소드들을 구체적으로 정의하여
		//이름없는 객체를 만들어 사용하는 방법
		RemoteControl rc = new RemoteControl() {
			public void turnOn() {}
			public void turnOff() {}
			public void setVolume(int volume) {}
		};//추상메소드 안에서 선언한 것들
		
	}

}
