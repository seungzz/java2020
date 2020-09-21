package day16.interface01;

public interface RemoteControl {
	//인터페이스는 일반적으로 변수를 지원하지 않지만 상수는 쓸 수 있다.
	//인터페이스는 단독으로 사용가능
	int MAX_VOLUME =10;
	int MIN_VOLUME =0;
	
	void turnOn();
	void turnOff();
	void setVolume(int Volume);
	
	
	
	//디폴트메소드, 일반 메소드처럼 사용할 수 있다.(자바8부터 추가됨)
	default void setMute(boolean mute) {
		if(mute)	{
			System.out.println("무음");
			
		}else {
			System.out.println("무음해제");
		}
	}
	
	static void changeBattery() {
		System.out.println("건전지교환");
	}
}
