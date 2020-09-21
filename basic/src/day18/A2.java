package day18;

public class A2 {
	A2() {
		System.out.println("A2객체생성");
	}
	class B {
		B() {System.out.println("B객체가생성");}
		int field1;
		void method1() {}
		
		
	}
		
	static class C{
		C() {System.out.println("C객체가 생성");}
		int field1;		//클래스가 다르기 때문에 같은 이름인 field1을 사용할 수 있다.
		static int field2;
		void method1() {}
		static void method2() {}
	}
	
	void method() {
		class D {
			D() {System.out.println("D객체 생성"); }
			int field1;
			//static int field1;
			void method1() {}
		}
		D d = new D();
		d.field1 =3;
		d.method1();
	}
}
