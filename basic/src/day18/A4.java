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
		// field1 = 10; //static�� �Ϲ��ν��Ͻ��ʵ�� �޼ҵ�� ������ �Ұ����ϴ�.
		// method1();
			
		   field2 = 10;
		   method2();
		}
	}
}