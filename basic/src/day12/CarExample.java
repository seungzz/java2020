package day12;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setSpeed(-50);
		//speed�� private�� ����Ǿ��� ������ setter�� �ʿ��ϴ�.
		
		System.out.println("����ӵ� :" + myCar.getSpeed());
		
		myCar.setSpeed(60);
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
			
		}
		
		System.out.println("����ӵ� :" +myCar.getSpeed());
	}
}
