package day18;

public class A3 {

	B field1 = new B();
	C field2 = new C();
	
	//�ν��Ͻ� �޼ҵ�
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	//�����ʵ� �ʱ�ȭ
	//static B field3 = new B();	 B�� �ν��Ͻ�Ŭ�����̱� ������ �����ʵ忡 ���Ұ�
	static C field4 = new C();
	
	
	//���� �޼ҵ�
	static void method2() {
		//B var1 = new B();			B�� �ν��Ͻ� Ŭ�����̱� ������ �����޼ҵ���Ұ�
		C var2 = new C();
	}
	
	
	class B {}
	
	static class C{}
}
