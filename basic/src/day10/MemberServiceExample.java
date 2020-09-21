package day10;

public class MemberServiceExample {
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		
		boolean result = memberService.login("kang", "12345");
		
		if(result) {
			System.out.println("로그인되었습니다.");
			memberService.logout("kang");
			System.out.println("로그아웃되었습니다.");
 		} else {
 			System.out.println("id 또는 pw가 올바르지 않습니다.");
 		}
	}
}



