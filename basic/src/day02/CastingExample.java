package day02;

public class CastingExample {
	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char)intValue; //int = 4byte  char = 2byte
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int)longValue;	//()안의 형으로 강제 변환시켜준다.
		System.out.println(intValue);
		
		
		double doubleValue = 3.14;
		intValue = (int)doubleValue;	//int는 정수기 때문에 소수지원x
		System.out.println(intValue);
		
	}

}
