package day18;

public class A {
	static int i = 0;
	
	static void method3() {
		class D {		//메소드밑에도 클래스를 만들 수 있다 -> 로컬클래스
			D() {} //생성자
			int field1;
			//static int field2; 로컬클래스에는 static 사용할 수 없다.
		}
		
	}
	
	
	
	static class C{
		C() {};
		int field1;
		static int field2;
		void method() {
			
		}
		
		static void method2() {}
	}
}
