package day11;

public class ClassName {

	int field1;
	void method1() {
	}
	
	
	static int field2;
	static void method2() {
		
	}
	
	static {
		//field1 = 10;
		//method1();
		field2 = 10;
		method2();
	}
	//field1�� method1�� �ν��Ͻ� �ʵ峪 �ν��Ͻ� �޼ҵ� ������. new��ü�� ������ �������Ѵ�.
	
	static void method3() {
		//this.field1 =10;
		//this.method1();
		field2 = 10;
		method2();
	}
}
	
	

