package day38.IO2;

import java.io.Serializable;

public class ClassA implements Serializable{
	//������ ���ܸ� ����ȭ�ϴµ� ������ ����
	int field;
	ClassB field2 = new ClassB();
	static int filed3;
	transient int field4;//transient�� ����ִ� �ʵ�� �ۼ����� �ʴ´�.
	public int field3;
	
}
