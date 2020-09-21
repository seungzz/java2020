package day16.interface01;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;	//인터페이스와 추상 클래스와 비슷한 점이 많다(단독사용 불가, 구현 객체의 형식도 비슷함)
		rc = new Television();
		rc = new Audio();
	}

}
