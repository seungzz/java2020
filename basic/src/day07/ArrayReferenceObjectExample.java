package day07;

public class ArrayReferenceObjectExample {
	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] ="Java";
		strArray[1] ="Java";
		strArray[2] = new String("Java");
		//왜자꾸 new가 나올까? 기본타입은 new를 쓰지 않지만 참조타입,객체의 경우 new를 사용한다
		//->새로운 값을 만들어주어야 하기 때문이다
		
		
		
		System.out.println(strArray[0]==strArray[1]);
		System.out.println(strArray[1]==strArray[2]);
		System.out.println(strArray[0].contentEquals(strArray[2]));
		//배열의 경우도 일반 String과 마찬가지로(스택에 주소만 갖고있기 때문) .equals를 이용해서 비교해야 한다.
		
	}

}
