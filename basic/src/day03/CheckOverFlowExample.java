package day03;

public class CheckOverFlowExample {
	public static void main(String[] args) {
		long left = -2000000000;
		long right = 2000000000;
		
		//int로 변수를 선언한다면 이미 오버플로우가 되어 if문 실행할 수 없다.
		
		System.out.println("ㅇㅇ"+(left-right));
		System.out.println("ㅇㅇ"+Integer.MAX_VALUE);
		System.out.println("ㅇㅇ"+Integer.MIN_VALUE);
		
		
		
		
		
		
		if((right>0)) {
			if((left-right)<Integer.MIN_VALUE) {
				
				System.out.println("오버플우발생");
			}
			
		
				}else {
					System.out.println("쉬면서 하세요");
				}
		
			}
			
				
	}


