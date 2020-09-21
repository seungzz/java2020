package day15;

class A{}

class B extends A{}

class C extends A{}

class D extends B{}

class E extends C{}

public class PrommotionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		
		B b1 = d;
		C c1 = e;
		

//부모타입의 부모타입까지 상속받을 수 있다.		

//		B b3 = e;  B와E는 상속 관계에 있지 않기 때문에 자동 변환이 불가능하다
//		C c2 = d;  직접 연결된 연결고리는 없기 때문이다.
	}
	
}
