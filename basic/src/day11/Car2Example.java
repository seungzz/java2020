package day11;

public class Car2Example {
	public static void main(String[] args) {
		Car2 myCar = new Car2();
		myCar.keyTrunON();
		myCar.run();
		int speed = myCar.getSpeed();  //���� �������� �ʰ� �޼ҵ带 ���ؼ� ������ �Ѵ�.
		//myCar.speed = 10; �ܺ����� ���� �������� ���ϰ� �޼ҵ带 ���ؼ� �����ؾ���.
		System.out.println("����ӵ�  : "+speed+"km/h)");
	}

}		//������ private�� ��ȣ�ϰ� ������ ��ȣ�ϸ鼭 ���� �� �ִ°� ->ĸ��ȭ
