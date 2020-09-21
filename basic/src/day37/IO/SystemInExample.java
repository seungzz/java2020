package day37.IO;

import java.io.InputStream;

public class SystemInExample {
	public static void main(String[] args) throws Exception {
		System.out.println("====메뉴====");
		System.out.println("1. 예금 조회");
		System.out.println("2. 예금 출금");
		System.out.println("3. 예금 입금");
		System.out.println("4. 종료 하기");
		System.out.println("메뉴를 선택하세요");
		
		InputStream is = System.in;	//키보드 입력 스트림 얻기
									//System.in은 콘솔에 입력하겠다.
	
		char inputChar = (char) is.read();		//저장된 아스키 코드를 문자로 변환
		int i =is.read();
		System.out.println("아스키 코드 : "+i);
		switch(inputChar) {
		case '1': 
			System.out.println("예금조회를 선택하셨습니다.");
			break;
		case '2': 
			System.out.println("예금출금을 선택하셨습니다.");
			break;
		case '3': 
			System.out.println("예금입금을 선택하셨습니다.");
			break;
		case '4': 
			System.out.println("종료하기를 선택하셨습니다.");
			break;
		}
	}
}
