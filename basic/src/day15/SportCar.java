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
//		System.out.println("멈춤");
//		speed = 0;
//	} final로 못박힌 애들은 어떻게 해도 오버라이드를 받을 수 없다. (부모클래스에서 final로 정의 되었기 때문이다.)
}
