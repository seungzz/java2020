package day17;

public interface MyInterface {
	public void method1();
	
	public default void method2() {
		System.out.println("MyInterface-method2 ����");
	}
	//�޼ҵ带 ���Ŀ� �� �߰��ϰ� �ȴٸ� ������ü �ϳ��ϳ� �� �������̵带 �ؾ��ϴ� ���ŷο��� ����� -> default method�� ������ش�.
}
