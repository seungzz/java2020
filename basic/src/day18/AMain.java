package day18;

public class AMain {
	public static void main(String[] args) {
		A2 a = new A2();
		
		A2.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		
		A.C c = new A.C();
		c.field1 = 3;
		c.method();
		
		A2.C.field2 = 3;
		A2.C.method2();
		//로컬 클래스 객체 생성을 위한 메소드 호출
		a.method();
	}
}
