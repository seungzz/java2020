package day32.Generic;

public class Util {
	public static <T extends Number> int compare(T t1,T t2) {
		//byte,short,long �� ���� ���� Ÿ�Ե��� Number��� Ÿ���� ��ӹ޴� �ֵ��̴�.
		
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return Double.compare(v1, v2);
		
	}
}