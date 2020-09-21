package day04;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "신민철";	//주소1에 저장
		String strVar2 = "신민철";	//주소1에 저장(값이 같으므로)
		String strVar3 = new String("신민철"); 	//새로운 객체를 생성한다. 새로운 주소에 저장함.
		
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);
		
		
		
		
		System.out.println();
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3)); //스트링은 주소만 비교하는 특별한 경우가 아니면 무조건 equals사용
	}

}
