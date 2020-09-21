package day11;

public class Car2Example {
	public static void main(String[] args) {
		Car2 myCar = new Car2();
		myCar.keyTrunON();
		myCar.run();
		int speed = myCar.getSpeed();  //직접 접근하지 않고 메소드를 통해서 접근을 한다.
		//myCar.speed = 10; 외부인이 직접 접근하지 못하게 메소드를 통해서 접근해야함.
		System.out.println("현재속도  : "+speed+"km/h)");
	}

}		//정보를 private를 보호하고 정보를 보호하면서 꺼낼 수 있는것 ->캡슐화
