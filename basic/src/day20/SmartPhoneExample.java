package day20;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);  //smartPhone객체에서 오버라이딩한 toString()의 값을 String에 넣은 값출력
		
		System.out.println(myPhone); //smartPhone객체를 바로 println으로 출력
	}
}
