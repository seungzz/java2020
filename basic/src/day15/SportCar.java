package day15;

public class SportCar extends Car{

	@Override
	public void speedUp() {
		speed+=10;
		// TODO Auto-generated method stub
		super.speedUp();
	}
//	@OVerride 
//	public void stop()	{
//		System.out.println("����");
//		speed = 0;
//	} final�� ������ �ֵ��� ��� �ص� �������̵带 ���� �� ����. (�θ�Ŭ�������� final�� ���� �Ǿ��� �����̴�.)
}
