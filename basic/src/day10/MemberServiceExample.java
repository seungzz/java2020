package day10;

public class MemberServiceExample {
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		
		boolean result = memberService.login("kang", "12345");
		
		if(result) {
			System.out.println("�α��εǾ����ϴ�.");
			memberService.logout("kang");
			System.out.println("�α׾ƿ��Ǿ����ϴ�.");
 		} else {
 			System.out.println("id �Ǵ� pw�� �ùٸ��� �ʽ��ϴ�.");
 		}
	}
}



