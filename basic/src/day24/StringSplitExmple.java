package day24;

public class StringSplitExmple {
	public static void main(String[] args) {
		String text = "홍길동&강승지,이은주,김자바-최명호";
		
		//split()는 특정 문자로 문자열을 분리하는 메소드 입니다.
		String[] names = text.split("&|,|-");
		
		for(String name : names) {
			System.out.println(name);
			
		}
	}
}
