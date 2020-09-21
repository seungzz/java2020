package day12;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setSpeed(-50);
		//speed는 private로 선언되었기 때문에 setter가 필요하다.
		
		System.out.println("현재속도 :" + myCar.getSpeed());
		
		myCar.setSpeed(60);
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
			
		}
		
		System.out.println("현재속도 :" +myCar.getSpeed());
	}
}
