package day16;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		//parent.field2 = "data2";
		//parent.method3();
		
		
		//����Ÿ�� ��ȯ�� �������� �ڽ� ��ü���� ��ü���� ������ Ÿ���� �ڽ� Ŭ������ ���ư� �� �ִ�.
		//���� �θ� Ÿ���̾��� ��ü�� �ڽ� Ŭ������ ���� Ÿ�� ��ȯ�� �Ұ��ϴ�.
		
		
		Child child = (Child) parent;
		child.field2 = "data2";
		child.method3();
	}
}
