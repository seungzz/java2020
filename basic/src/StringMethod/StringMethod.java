package StringMethod;

import java.io.UnsupportedEncodingException;

public class StringMethod {
	public static void main(String[] args) {
		String str = "Hello";
		int i =2;
		char[] c = new char[10];
		
		System.out.println("문자열 길이 length(): "+ str.length());
		System.out.println("문자열 중 i번째 문자를 반환: "+str.charAt(i));
		System.out.println("문자열의 일부를 char[]로 제공: "+c);
		str.getChars(0, str.length(), c, 1);
		
		System.out.println("문자열 비교, 대소문자 무시: "+str.equalsIgnoreCase("hello"));
		
		System.out.println("문자열이 'h'로 시작하라면 ture로 반환: "+str.startsWith("h"));
		
		System.out.println("현재의 문자열이 \"lo\"로 끝나면 ture로 반환하는 메소드:"+str.endsWith("lo"));
		
		System.out.println("현재의 문자열과 지정된 문자열을 비교하여 현재의 문자열이 \n" 
		+ "비교된 문자열보다 크면 양수,같으면0, 작으면 음수값을 반환: "+str.compareTo("A"));
		
		System.out.println("비교할 문자문이 str의 몇번째에 위치하는지 반환하는 메소드: "+str.indexOf("l"));
		
		System.out.println("비교할 문자문이 str의 startIndex(3)부터"+ "몇번째에 위치하는 메소드: "+str.indexOf("1",3));
		
		System.out.println("비교할 문자가 인덱스를 마지막부터 비교하여" +"몇번째에 위치하는지 반환하는 값: "+str.lastIndexOf("1"));
		
		System.out.println("지정 인덱스부터 지정 인덱스(-1)까지 반환하는 함수: "+str.substring(1,3));//1부터2까지의 문자열 반환
		
		System.out.println("결합된 문자열을 반환하는 메소드: "+str.concat("world"));
		
		System.out.println("매개변수에 쓰여진 문자를 두번째 매개변수에 쓰여진 문자로 교체: "+str.replace("o", "ow"));
		
		System.out.println("문자열의 시작과 끝에 있는 공백을 제거하는 메소드: "+str.trim());
		
		System.out.println("쓰여진 문자를 소문자로 반환하는 메소드: "+str.toLowerCase());
		
		System.out.println("쓰여진 문자를 대문자로 반환하는 메소드: "+str.toUpperCase());
		
		System.out.println("매개변수를 기준으로 문자를 배열로 나누는 메소드: "+str.split(" "));
		
		System.out.println("문장내에 매개변수로 주어진 문자가 있는지 true와 false로 반환하는 메소드: "+str.contains("s"));
		
		System.out.println("주어진 문자열을 아스키 코드로 반환하는 메소드: "+str.getBytes());
		
		try {
			System.out.println("주어진 문자열을 해당 문자셋으로 반환하는 메소드: "+str.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("해당 문자열이 비었는지 알려주는 메소드: "+str.isEmpty());
		
		System.out.println("문자열에 지정한 문자가 있으면 첫번째만 새로 지정한 문자로 바꿔주는"+"메소드: "+str.replaceFirst("l", "llo hel"));
		
		System.out.println("정규표현식을 사용하여 첫번째 매개변수에 해당하는 문자를 "+"두번쨰 매개변수에 해당하는 문자로 치환:"
		+str.replaceAll("[0-9]", " ")+ //0부터9까지 공백으로 바꾸겠다.
		str.replaceAll("[^8-9]", " ")	//0-9를 제외한 나머지를 교체
		+str.replaceAll("[a-z", " ")
		+str.replaceAll("[a-z|A-Z]", " ")
		+str.replaceAll("[ㄱ-ㅎ|ㅏ-ㅣ|가-힣]", " ")	//한글을 해당 문자열로 교체
		+str.replaceAll("[^ㄱ-ㅎ|^ㅏ-ㅣ|^가-힣]", " "));	//한글이 아닌 모든 문자를 해당 문자열로 교체
		
		
		
				
	}
}
