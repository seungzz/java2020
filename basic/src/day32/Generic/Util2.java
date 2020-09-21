package day32.Generic;

public class Util2 {
	public static Integer getValue(Pair<String, Integer> pair,String string) {
		if(pair.getKey()== string) {
			return pair.getValue();
		}else 
			return null;
	}
}
