package day15;

public class Car2Example {
	public static void main(String[] args) {
		Car2 car = new Car2();
		
		for(int i=0; i<5; i++) {
			int problemLocation = car.run();
		
		
		switch(problemLocation) {
		
		case 1 :
			System.out.println("�տ��� �ѱ�Ÿ�̾�� ��ü");
			car.frontLeftTire = new HankookTire("�տ���", 15);
			break;
		case 2 :
			System.out.println("�տ����� ��ȣŸ�̾�� ��ü");
			car.frontRightTire = new HankookTire("�տ�����", 13);
			break;
		case 3 :
			System.out.println("�ڿ��� �ѱ�Ÿ�̾�� ��ü");
			car.backLeftTire = new HankookTire("�ڿ���", 14);
			break;
		case 4 :
			System.out.println("�ڿ����� ��ȣŸ�̾�� ��ü");
			car.backRightTire = new HankookTire("�ڿ�����", 17);
			break;
		}
		System.out.println("----------");
	}
	
}
}
