package day11;

public class Car3Example {
	public static void main(String[] args) {
		Car3 myCar = new Car3("������");
		Car3 yourCar = new Car3("����");	//static�� new��� ���� �ʾƵ� ����� �� �ִ�. -> ���� �Ѱ��� �����Ѵ�.
										//�ν��Ͻ��� ��� ���� ����������� static�� Ŭ������ ����ɶ� �Ѱ��� �޸𸮿� �ö󰣴�. 
										//-> new�� ���� �ν���Ʈ�� ��� ���� ��������� ����
		myCar.run();
		yourCar.run();
		
	}
}