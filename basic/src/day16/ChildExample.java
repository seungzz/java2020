package day16;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		//parent.field2 = "data2";
		//parent.method3();
		
		
		//강제타입 변환은 원래부터 자식 객체였던 객체만이 원래의 타입인 자식 클래스로 돌아갈 수 있다.
		//원래 부모 타입이었던 객체는 자식 클래스로 강제 타입 변환이 불가하다.
		
		
		Child child = (Child) parent;
		child.field2 = "data2";
		child.method3();
	}
}
