package day11;

public class Car3Example {
	public static void main(String[] args) {
		Car3 myCar = new Car3("포르쉐");
		Car3 yourCar = new Car3("벤츠");	//static은 new라고 하지 않아도 사용할 수 있다. -> 보통 한개만 지정한다.
										//인스턴스는 계속 새로 만들어지지만 static은 클래스가 실행될때 한개만 메모리에 올라간다. 
										//-> new를 쓰면 인스턴트는 계속 새로 만들어지기 때문
		myCar.run();
		yourCar.run();
		
	}
}
