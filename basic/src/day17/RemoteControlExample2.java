package day17;

public class RemoteControlExample2 {
	public static void main(String[] args) {
		RemoteControl rc = null;
		
		//디폴트메소드는 오버라이딩을 굳이 하지 않아도 사용할 수 있다. 
		rc = new Television();
		rc.turnOn();
		rc.setMute(true);
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
		
		RemoteControl.changeBattery();	//정적메소드를 만들어놓았기 때문이다.
		//인터페이스는 단독으로 객체를 만들 수 없지만 갖고있는 상수는 .을 찍어서 사용할 수 있다. 
		System.out.println("건전지교환");
	}
}
