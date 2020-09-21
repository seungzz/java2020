package day32.Generic;

public class Util {
	public static <T extends Number> int compare(T t1,T t2) {
		//byte,short,long 과 같은 숫자 타입들은 Number라는 타입을 상속받는 애들이다.
		
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return Double.compare(v1, v2);
		
	}
}
