package day18;

public class A4 {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B {
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	static class C{
		void method() {
		// field1 = 10; //static에 일반인스턴스필드와 메소드는 접근이 불가능하다.
		// method1();
			
		   field2 = 10;
		   method2();
		}
	}
}
