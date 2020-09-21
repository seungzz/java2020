package day04;

public class SwitchExample {
	public static void main(String[] args) {
		int num = (int)(Math.random()*6+1);
		switch(num) {
		case  1:
			System.out.println("1");
			break;
		case  2:
			System.out.println("2");
			break;
		case  3:
			System.out.println("3");
			break;
		case  4:
			System.out.println("4");
			break;
		case  15:
			System.out.println("5");
			break;
		default:
			System.out.println("6번");
			break;
		}//스위치 1이 나온다면:~~를 실행시키겠어! case문을 사용하면 무조건 break사용해야함 ->계속 실행되기 때문이다.
	}

}
