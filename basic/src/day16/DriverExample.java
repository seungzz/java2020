package day16;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus); //원래는 달린다 라고 나와야하는데 bus객체가 오버라이딩 되었기 때문에 버스가 달린다로 나온다.
		driver.drive(taxi);
	}
}
