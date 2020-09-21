package day05;

public class BreakExample {
	public static void main(String[] args) {
		while(true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			
			if(num==6) {
				break; //while안에 while이 있었는데 제일 하위에 있었다면 제일 큰 while은 빠져나가지 못함.
					   //while이 두개 있다면 다른 방법을 생각해봐야함->다음에
				
			}
		}
		System.out.println("종료");
	}

}
