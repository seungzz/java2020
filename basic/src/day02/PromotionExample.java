package day02;

public class PromotionExample {
	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		System.out.println(byteValue);
		
		char charValue = '��';
		intValue = charValue; // int <- char  
		
		System.out.println(charValue+ "�� �����ڵ�= "+ intValue);
		
		intValue = 500;
		long longValue = intValue; //long <- int    �������� ū�Ϳ� �������� �� Ż ���� ����.
		System.out.println(longValue);
		
		
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);
		
	}

}
