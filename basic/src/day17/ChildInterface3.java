package day17;

public interface ChildInterface3 extends ParentInterface{

	@Override
	public void method2();
	//���� method2()�� default method����.
	//���Ѵٸ� ����Ʈ �޼ҵ带 �߻�޼ҵ�� �������̵� �����ϴ�
	//�ʿ信 ���� ����Ʈ �޼ҵ带 �߻�޼ҵ�ó�� ���� ������ �߻�޼ҵ�ó�� �������ؼ� ����� �� �ִ�. 
	public void method3();

}
