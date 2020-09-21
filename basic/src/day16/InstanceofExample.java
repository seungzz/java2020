package day16;

public class InstanceofExample {
	
	public static void method1(Parent parent) {
		if(parent instanceof Child) {	//instanceof�� child�� ����������� �ƴ��� �˻縦 ���ش�. 
										//������ ����ȯ �ϱ� ���� Ȯ������ �� �մ�. 
			Child child = (Child) parent;
			System.out.println("method1-Child�� ��ȯ ����");
		}else {
			System.out.println("method1-Child�� ��ȯ ����");
		}
	}
	
	public static void method2(Parent parent) {
		System.out.println("method2-Child�� ��ȯ ����");
	}
	public static void main(String[] args) {
		Parent parentA = new Child();	//child��ü�� parent ��ü�� ���� ���� ����ȯ�ص� ����ȯ�� �ȴ�.
		method1(parentA);
		method2(parentA);
		
		
		Parent parentB = new Parent();	
		method1(parentB);
		method2(parentB);	//parent�� ������� ������ ���� �߻�
	}
}