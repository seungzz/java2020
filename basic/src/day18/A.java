package day18;

public class A {
	static int i = 0;
	
	static void method3() {
		class D {		//�޼ҵ�ؿ��� Ŭ������ ���� �� �ִ� -> ����Ŭ����
			D() {} //������
			int field1;
			//static int field2; ����Ŭ�������� static ����� �� ����.
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
