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
	//field1과 method1은 인스턴스 필드나 인스턴스 메소드 사용금지. new객체를 무조건 만들어야한다.
	
	static void method3() {
		//this.field1 =10;
		//this.method1();
		field2 = 10;
		method2();
	}
}
	
	

