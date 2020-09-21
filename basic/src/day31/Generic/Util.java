package day31.Generic;

public class Util {
	public static <T> Box2<T> boxing(T t) {
		Box2<T> box = new Box2<T>();
		
		box.set(t);
		
		return box;
	}
}
