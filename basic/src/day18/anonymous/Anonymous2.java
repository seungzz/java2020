package day18.anonymous;

public class Anonymous2 {
	//�ʵ� �ʱⰪ���� ����
	
	RemoteControl field = new RemoteControl() {
	
	
	public void turOn() {
		System.out.println("Ƽ���Ҵ�");
	}
	@Override
	public void turnOff() {
		System.out.println("Ƽ�����");
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
			System.out.println("����� �մϴ�");
		}
		@Override
		public void turnOff() {
			System.out.println("����� ����");
		}
		
	};
	//���ú������
	localVar.turnOn();
}
	void method2(RemoteControl rc) {
		rc.turnOn();
}
}