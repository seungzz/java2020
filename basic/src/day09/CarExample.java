package day09;

public class CarExample {
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("car1.com: " + car1.company );
		System.out.println();
		
		Car car2 = new Car("�ڰ���");
		System.out.println("car2.com: "  + car2.company);
		System.out.println("car2.mo:" +car2.model);
		System.out.println();
		
		Car car3 = new Car("�ڰ���", "����");
		System.out.println("car3.com: "  + car3.company);
		System.out.println("car3.mo:" +car3.model);
		System.out.println("car3.color: " + car3.color);
		
		Car car4 = new Car("�ý�", "���� ", 200);
		System.out.println("car4.com: "  + car4.company);
		System.out.println("car4.mo:" +car4.model);
		System.out.println("car4.color: " + car4.color);
		System.out.println("car4.maxspeed: " +car4.maxSpeed);
		
	}
}
//�����ڿ��� ������� ���� ��θ� ���� �� ����