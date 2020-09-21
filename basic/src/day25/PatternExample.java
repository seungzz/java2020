package day25;

import java.util.regex.Pattern;

public class PatternExample {
	public static void main(String[] args) {
		
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("규식이와 일치");
			
		}else {
			System.out.println("규식이와 일치X");
			
		}
		regExp = "\\w+@\\w+\\.\\w+(\\.\\W+)?";
		data = "angel@navercom";
		result = Pattern.matches(regExp, data);
		if(result) {
				System.out.println("규식이와 일치");
		}else {	
			System.out.println("규식이와 일치X");
		}
	}
}
