package day02;

public class If {
	public static void main(String[] args) {
		int v1 = 15;
		int v2 ;
		//if 함수는 ()안에 값이 참일때 실행되는 메소드
		if(v1>10) {
			v2 = v1 -10;
			System.out.println("진실일때 실행");
			
		}else {
			System.out.println("거짓일때 실행");
			v2 = 4444; //else에서 v2를 선언해주지 않으면 아래 println 오류뜬다.
		}
		System.out.println("무조건실행");
		System.out.println(v2);
	}

}