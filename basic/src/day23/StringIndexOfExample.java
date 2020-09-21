package day23;

public class StringIndexOfExample {
	public static void main(String[] args) {
		String subject = "수학의 정석";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);	//세번째 인덱스부터 프로그래밍이 나온다.
		
		if(subject.indexOf("자바")!=-1) {	//-1이 반환된다면 찾고자 하는 내용이 없다.
			System.out.println("자바와 관련된 책이군요?");
			
		}else {
			System.out.println("자바와 관련이 없는 책이네요.");
		}
	}
}
