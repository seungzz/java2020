package day24;

public class StringTrimExample {
	public static void main(String[] args) {
		String tel1= "  02";
		String tel2= "123   ";
		String tel3= "    1234   ";
		
		String tel = tel1.trim() +tel2.trim() +tel3.trim();
		System.out.println(tel);
		
		
		//trim메소드는 문자열의 앞뒤 공백을 제고합니다. 하지만 중간의 공백은 제거하지 않습니다.
		String oldStr = "  자바프  로그래밍";
		String newStr = oldStr.trim();
		System.out.println(newStr);
		
		
	}
}
