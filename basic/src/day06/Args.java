package day06;

public class Args {
	public static void main(String[] args) {		//배열 선언.   args는 기본값을 부르는 것이다.
		if(args.length !=2) {
			System.out.println("프로그램의 사용법");
			System.out.println("java MainStringArrayArument num1 num2");
			System.exit(0);		//프로그램을 자동으로 끌 수 있음(강제종료 명령어)
			
		}
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);	//string을 int로 바꾸는 명령어이다.
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1+ num2;
		System.out.println(num1+ "+" +num2 + "="+result);
	}

}
