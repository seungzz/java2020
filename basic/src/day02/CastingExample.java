package day02;

public class CastingExample {
	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char)intValue; //int = 4byte  char = 2byte
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int)longValue;	//()���� ������ ���� ��ȯ�����ش�.
		System.out.println(intValue);
		
		
		double doubleValue = 3.14;
		intValue = (int)doubleValue;	//int�� ������ ������ �Ҽ�����x
		System.out.println(intValue);
		
	}

}
