package day11;

public class Singleton {
	//���� �ʵ�� �ڱ��ڽ��� ��ü ����
	private static Singleton s = new Singleton();
	
	
	// ������ private(����������)�� ������ �������� ���ϰ� ���ƹ��� 
	//�̱���: �ڱ��ڽ��� ȥ�� �����ϰ� ���������� ��ü�̴�. 
	private Singleton()	{ 
		
	}
	//�̱��� ��ü�� �����ϰ� getInstance �޼ҵ带 ���� ������ ��ü�� �ҷ��� �� ����
	static Singleton getInstance() {
		
		
		
		
		return s;		//static�̱� ������ �ٷ� ����� �� �ִ�.
		//�׻� ���� ��ü�� �ҷ��´�.
		//setInstance()�� ����ϸ� ������ �� �ִ�. <- final�� �ٸ� ���
	}
}
