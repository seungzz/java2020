package day15;

public class SupersonicAirplaneExample {
	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		
		
		
		//�θ� override�Ǳ� ���� ���� �ִ� �޼ҵ带 �״�� ����� �� �ִ�.
		sa.takeOff();
		sa.fly();
		sa.flyMode	= SupersonicAirplane.SUPERSONIC;
		//flyMode�� SUPERSONIC���� �ٲ��ְԵȴ�.
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
	}
}
