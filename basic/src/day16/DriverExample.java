package day16;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus); //������ �޸��� ��� ���;��ϴµ� bus��ü�� �������̵� �Ǿ��� ������ ������ �޸��ٷ� ���´�.
		driver.drive(taxi);
	}
}
