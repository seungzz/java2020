package day26.ex;

import java.util.regex.Pattern;
//���ĺ����� ����,�ι�°���� ���ڿ� ���ĺ����� ������ 8~12�� ������ id
public class PatternMatcherExample {
	public static void main(String[] args) {
		String id = "5Angel1004";
		String regExp ="[a-zA-Z]\\w+{8,12}";
				
				
		boolean isMatch = Pattern.matches(regExp, id);
		if(isMatch) {
			System.out.println("ID�� ��밡��");
		}else {
			System.out.println("ID�� ��� �Ұ���");
		}
	}
}
