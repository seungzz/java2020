package day15;

public class SupersonicAirplane extends Airplane	{
	public static final int NORMAL =1;
	public static final int SUPERSONIC = 2;
	//메소드에 final이 붙은 경우 오버라이딩이 되지 않는다
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행");
		}else {
			super.fly();// super를 이용해서 부모메소드 사용가능하다.
		}
	}
}
