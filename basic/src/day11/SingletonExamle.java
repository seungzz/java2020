package day11;

public class SingletonExamle {
	public static void main(String[] args) {
		//Singleton obj1 = new Singleton();
		//Singleton obj2 = new Singleton();    ������ ���� ����. private�� �������� ����.
		
		
		
		
		
		
		Singleton obj3 = Singleton.getInstance();
		Singleton obj4 = Singleton.getInstance();
		
		if(obj3==obj4) {		//equals�Ƚᵵ �ƿ� �Ȱ��� ������ ���� �̱����̶�� ���´�.
			System.out.println("���� �̱��水ü");
		}
		else {
			System.out.println("�ٸ� �̱��水ü");
		}
	}
}
