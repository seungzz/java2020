package day18.anonymous;

public class Anonymous2 {
	//필드 초기값으로 대입
	
	RemoteControl field = new RemoteControl() {
	
	
	public void turOn() {
		System.out.println("티비켠다");
	}
	@Override
	public void turnOff() {
		System.out.println("티비끈다");
	}
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		
	}
};


void method1() {
	RemoteControl localVar = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("오디오 켭니다");
		}
		@Override
		public void turnOff() {
			System.out.println("오디오 끈다");
		}
		
	};
	//로컬변수사용
	localVar.turnOn();
}
	void method2(RemoteControl rc) {
		rc.turnOn();
}
}