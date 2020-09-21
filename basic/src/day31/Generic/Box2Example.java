package day31.Generic;

public class Box2Example {
	public static void main(String[] args) {
		Box2<String> box2 = new Box2<String>();
		
		box2.set("hello");
		String str = box2.get();
		
		Box2<Integer> box3 = new Box2<Integer>();
		box3.set(6);
		int value = box3.get();
		
		Box2<Apple> box4 = new Box2<Apple>();
		box4.set(new Apple());
		Apple apple = box4.get();
		
		//제네릭은 생성할떄 타입을 지정해준다면 타입 변환없이 객체를 사용할 수 있어서
		//비제네릭에 비해 리소스에 부담이 적다.
	}
}
