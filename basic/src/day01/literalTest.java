package day01;

public class literalTest {
	public static void main(String[] args) {
		//0, 75, -100 �Ҽ����� ���� ���� ���ͷ�
		//byte, char, short, int, long �� ������ �ȴ�.
		
		double d2= 2E3;
		System.out.println(d2);
		double d3 = 2E-10;
		System.out.println(d3);
		//���� ���ͷ�
		char c3= '\t'; //  \t�� ��(�а� ����) \n = �ٹٲ�
		
		//���ڿ� ���ͷ� -> ��""�� ���� �ؽ�Ʈ. ū����ǥ �ȿ��� �ؽ�Ʈ�� ��� ���ڿ� ���ͷ��� ����.
		System.out.println("      z");
		//���ڿ� ���ͷ� ���ο����� �̽������� ���ڸ� ��밡���ϴ�.
		
		String s = "���ѹα�";
		String s2 = "�Ǹ�ŭ �̵� \t �մϴ�.";
		String s3 = "���� �������� \n �մϴ�.";
		System.out.println(s);
		System.out.println(s2);
		System.out.println(s3);
		
		
		//�� ���ͷ�
		//true�� false�� �� ���ͷ��� �����Ѵ�.
		boolean bool = true;
		boolean bool2 = false;
		System.out.println(bool);
		System.out.println(bool2);
		
		
	}

}
