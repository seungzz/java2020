package day15;

public class SupersonicAirplaneExample {
	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		
		
		
		//부모가 override되기 전에 갖고 있던 메소드를 그대로 사용할 수 있다.
		sa.takeOff();
		sa.fly();
		sa.flyMode	= SupersonicAirplane.SUPERSONIC;
		//flyMode를 SUPERSONIC으로 바꿔주게된다.
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
	}
}
