package day31.Generic;

public class Box2 <T> {
	private T t;	//제네릭으로 들어온 어떠한 타입으로 객체를 만들겠다. (무엇이 들어오든 그 타입으로 만들겠다)
	public T get() { return t;}
	public void set(T t) {this.t = t;}
			
}
