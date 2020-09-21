package day26.ex;

import java.util.regex.Pattern;
//알파벳으로 시작,두번째부터 숫자와 알파벳으로 구성된 8~12자 사이의 id
public class PatternMatcherExample {
	public static void main(String[] args) {
		String id = "5Angel1004";
		String regExp ="[a-zA-Z]\\w+{8,12}";
				
				
		boolean isMatch = Pattern.matches(regExp, id);
		if(isMatch) {
			System.out.println("ID로 사용가능");
		}else {
			System.out.println("ID로 사용 불가능");
		}
	}
}
