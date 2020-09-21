package day16;

public class PhoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone(); 추상클래스인 phone생성 안된다.
		
		SmartPhone smartPhone = new SmartPhone("강승지");
		
		smartPhone.turnOn();
		smartPhone.internerSearch();
		smartPhone.turnOff();
		
		
	}

}
