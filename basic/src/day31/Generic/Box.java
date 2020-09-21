package day31.Generic;

public class Box {	//비제네릭으로 형식을 구현했을때
	private Object object;
	public void set(Object object) {
		this.object = object;
	}
	
	public Object get() { return object;}
	
}
