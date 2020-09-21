package day18;

public class A3 {

	B field1 = new B();
	C field2 = new C();
	
	//인스턴스 메소드
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	//정적필드 초기화
	//static B field3 = new B();	 B는 인스턴스클래스이기 때문에 정적필드에 사용불가
	static C field4 = new C();
	
	
	//정적 메소드
	static void method2() {
		//B var1 = new B();			B는 인스턴스 클래스이기 때문에 정적메소드사용불가
		C var2 = new C();
	}
	
	
	class B {}
	
	static class C{}
}
