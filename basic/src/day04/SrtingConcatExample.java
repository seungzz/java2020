package day04;

public class SrtingConcatExample {
	public static void main(String[] args) {
		String str1 = "JDK" + 6.0;   //��Ʈ���� ����Ÿ��. �������� �⺻Ÿ��->���� ������ ��������
		String str2 = str1 + "Ư¡";
		
		System.out.println(str2);
		
		String str3 = "JDK" +3 +3.0;
		String str4 = 3+ 3.0 + "JDK";
		System.out.println(str3);
		System.out.println(str4); //���� 6.0JDK�� ���� -> ������ ����! �¿� �������� ������ �Ǳ� ������
													  //double�� ��ȯ�Ǿ� ���� ����ǰ� ��Ʈ������ ��ȯ�Ǿ� �����.
		
		
	}

}
