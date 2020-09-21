package day17;

public interface ChildInterface3 extends ParentInterface{

	@Override
	public void method2();
	//원래 method2()는 default method였음.
	//원한다면 디폴트 메소드를 추상메소드로 오버라이딩 가능하다
	//필요에 따라서 디폴트 메소드를 추상메소드처럼 쓰고 싶을때 추상메소드처럼 재정의해서 사용할 수 있다. 
	public void method3();

}
