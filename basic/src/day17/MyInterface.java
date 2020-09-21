package day17;

public interface MyInterface {
	public void method1();
	
	public default void method2() {
		System.out.println("MyInterface-method2 실행");
	}
	//메소드를 이후에 더 추가하게 된다면 구현객체 하나하나 다 오버라이드를 해야하는 번거로움이 생긴다 -> default method를 만들어준다.
}
