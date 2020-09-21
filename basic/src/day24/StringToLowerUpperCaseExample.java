package day24;

public class StringToLowerUpperCaseExample {
	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA PROGRAMMING";
		
		System.out.println(str1.contentEquals(str2));
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		
		
		System.out.println(lowerStr1);
		System.out.println(lowerStr2);
		
		
		System.out.println(lowerStr1.equals(lowerStr2));
		
		String upperStr1 = str1.toUpperCase();
		String upperStr2 = str2.toUpperCase();
		
		System.out.println(upperStr1);
		System.out.println(upperStr2);
		
		
		System.out.println(str1.equalsIgnoreCase(str2));
		//equalsIgnoreCase()는 대소문자 구분없이 서로 같은 문장이면 true를 반환하는 메소드입니다.
	}
}
