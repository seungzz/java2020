package day38.IO2;

import java.io.Serializable;

public class ClassA implements Serializable{
	//구현만 해줌면 직렬화하는데 문제가 없음
	int field;
	ClassB field2 = new ClassB();
	static int filed3;
	transient int field4;//transient가 들어있는 필드는 작성하지 않는다.
	public int field3;
	
}
