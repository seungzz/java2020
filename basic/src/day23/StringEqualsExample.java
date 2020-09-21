package day23;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = new String("강승지");	//new로 만들어진 객체는 항상 다른 String객체를 참조한다.
		String strVar2 = "강승지";
		
		if(strVar1 == strVar2) {
			System.out.println("같은 객체참조");
			
		}else {
			System.out.println("다른 객체 참조");
			
		}
		if(strVar1.equals(strVar2)) {
			System.out.println("같은 문자열");
		}else {
			System.out.println("다른 문자열");
		}
	}
}
