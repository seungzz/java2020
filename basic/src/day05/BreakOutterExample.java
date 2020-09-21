package day05;

public class BreakOutterExample {
	public static void main(String[] args) {
		outter : for(char upper = 'A';upper<='Z'; upper++) {
			//아스키코드가 Z와 같아질때까지 for문을 돌린다.
			for(char lower ='a'; lower<='z';lower++) {
				System.out.println(upper+"-"+lower);
				
				if(lower=='g') {
					break outter;   //g가 나오면 outter를  정지시키겠다
				}
			}
		}
	System.out.println("종료");
	}

}
