package day02;

public class PromotionExample {
	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		System.out.println(byteValue);
		
		char charValue = '가';
		intValue = charValue; // int <- char  
		
		System.out.println(charValue+ "의 유니코드= "+ intValue);
		
		intValue = 500;
		long longValue = intValue; //long <- int    작은것이 큰것에 들어갈때에는 별 탈 없이 들어간다.
		System.out.println(longValue);
		
		
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);
		
	}

}
