package day24;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String text = "홍길동/이은주/강승지";
		
		//StringTokenizer는 구분자 하나를 사용하여 문자열을 구분하는 클래스이다.
		//구분자가 들어갈때 아무것도 넣지 않으면 " "공백으로 인식
		StringTokenizer st = new StringTokenizer(text, "/");
		int countToken = st.countTokens();
		for(int i=0; i<countToken;i++) {
			String token = st.nextToken();
			//nextToken()은 남아있는 토큰을 하나씩 반환하고, 배출한 토큰은 삭제한다.
			System.out.println(token);
		}System.out.println();
		
		
		
		//hasMoreTokens는 토큰을 가지고 있는지 알려주는 메소드이다. 남아있다면 true를 반환한다.
		st = new StringTokenizer(text,"/");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
			
		}
	}
}
