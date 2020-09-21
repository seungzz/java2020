package day03;

public class OperationsPromotionExample {
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		//char charValue3 = 
		//charValue1 + charValue2; 컴파일 에러 -> byte,short, int, char을 연산후 연산값은 항상 int로 나오기 때문이다.
		
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드: " + intValue2);
		System.out.println("출력문자 : " + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		//int intValue6 = 10/4.0; //컴파일에러
		
		double doubleValue = intValue5/4.0;
		System.out.println(doubleValue);
		
	}

}