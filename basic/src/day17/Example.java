package day17;

public class Example {
	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		
		ia.methodA();
		System.out.println();
		
		InterfaceB ib =impl;
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		//InterfaceC는 A와 B모두 상속받고 있기 때문에 가능.
	}
}
