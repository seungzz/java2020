package day05;

public class WhilekeyControlExample {
	public static void main(String[] args) throws Exception {
		int speed = 0;
		int keycode =0;
		
		boolean run = true;
		
		while(run) {
			
			
			if(keycode!=13 && keycode!=10) { //엔터에도 아스키코드가 있다. 엔터 입력했을때
				//13=캐리지리턴  -> 맨앞줄로 이동한다
				//10=라인피드  -> 한줄 밑으로 내려간다 위 두가지 과정이 엔터를 눌렀을때 이루어지는것.
				//엔터만 입력하는 것으로도 세번의 값이 들어간다 1.내가입력한값 2.캐리지리턴 3.라인피드
				//while문은 사실 세바퀴를 돈다. 하지만 13과 10일때를 보기 싫기 때문에 조건문으로 걸어두는것
				
				
				System.out.println("-----------");
				System.out.println("1.증속  |  2.감속  |  3.중지");
				System.out.println("선택: ");
				
			}
			
			keycode = System.in.read();
			//한번에 한개의 데이터밖에 들어갈수밖에 없음
				speed++;
				System.out.println("현재속도=" + speed);
				
			} if(keycode==50) {
				speed--;
				System.out.println("현재속도=" +speed);
			}else if(keycode==51) {
				run = false;
			}
		
		System.out.println("프로그램 종료");
	}
}
