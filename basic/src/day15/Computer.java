package day15;

public class Computer extends Calculator{
	
	
	@Override
	double areaCircle(double r) {	//오버라이드라고 했는데 areaCircle을 그대로 부모가 갖고 있지 않은 상태로 쓰지 않으면 에러뜬다
		System.out.println("Computer 객체의 areaCircle()실행");
		return Math.PI*r*r;
	
	}

}
