package day04;

public class SrtingConcatExample {
	public static void main(String[] args) {
		String str1 = "JDK" + 6.0;   //스트링은 참조타입. 나머지는 기본타입->값이 변수에 직접저장
		String str2 = str1 + "특징";
		
		System.out.println(str2);
		
		String str3 = "JDK" +3 +3.0;
		String str4 = 3+ 3.0 + "JDK";
		System.out.println(str3);
		System.out.println(str4); //값이 6.0JDK로 나옴 -> 연산의 순서! 좌우 방향으로 연산이 되기 때문에
													  //double로 변환되어 먼저 연산되고 스트링으로 변환되어 연산됨.
		
		
	}

}
