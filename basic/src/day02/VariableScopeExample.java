package day02;

public class VariableScopeExample {//변수의 범위
	public static void main(String[] args) {
		int v1 = 15;
		//int v2; 쓰고싶다면 다음 {}부터는 int를 선언할 수 없다
		//선언된 변수는 자신이 블럭 밖으로 벗어날 수 없다.
		//if 함수는 ()안에 값이 참일때 실행되는 메소드
		
		if(v1>10) {
			int v2 = v1 -10;
			System.out.println(v2);
			
		}
		//int v2는 if 블럭 안에서 사라졌기 때문에 다시 선언 가능
		int v2 =2;
		int v3 = v1+ v2 + 5;
		
		System.out.println(v3);
	}

}