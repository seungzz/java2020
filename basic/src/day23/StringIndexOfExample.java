package day23;

public class StringIndexOfExample {
	public static void main(String[] args) {
		String subject = "������ ����";
		
		int location = subject.indexOf("���α׷���");
		System.out.println(location);	//����° �ε������� ���α׷����� ���´�.
		
		if(subject.indexOf("�ڹ�")!=-1) {	//-1�� ��ȯ�ȴٸ� ã���� �ϴ� ������ ����.
			System.out.println("�ڹٿ� ���õ� å�̱���?");
			
		}else {
			System.out.println("�ڹٿ� ������ ���� å�̳׿�.");
		}
	}
}
