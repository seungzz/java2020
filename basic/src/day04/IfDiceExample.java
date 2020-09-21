package day04;

public class IfDiceExample {
	public static void main(String[] args) {
		int num = (int)(Math.random()*6) +1;
		//더블은 실수이기 때문에 int로 변형시켰을 경우 0~5가 나온다.(math.random은 0.001~0.999) 따라서 1을 더해준다
		
		if(num==1) {
			System.out.println("1번");
		}else if (num==2) {
			System.out.println("2번");
		}else if (num==3) {
			System.out.println("3번");
		}else if (num==4) {
			System.out.println("4번");
		}	else if (num==5) {
				System.out.println("5번");
		}else {
			System.out.println("6번");
		}
	}
	
}
