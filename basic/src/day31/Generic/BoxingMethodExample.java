package day31.Generic;

public class BoxingMethodExample {
	public static void main(String[] args) {
		Box2<Integer> box1 = Util.<Integer>boxing(100);
					  box1 = Util.boxing(100);	//이런식으로도 사용이 가능하다.
		int intValue = box1.get();
		
		Box2<String> box2 = Util.boxing("홍길동");
		String strValue = box2.get();
		
	}
}
