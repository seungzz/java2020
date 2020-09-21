package day11;

public class Car {
	//필드
	int gas;
	//생성자
	
	//메소드
	void setGas(int gas) {
		this.gas = gas;	//앞의 가스는 필드의 가스, 뒤의 가스는 매개변수로 들어온 새로운 가스
						//매치가 되어야 이해를 하기 더 쉽다.
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("가스없");
			return false;
		}
		System.out.println();
		return true;
		
	}
	void run() {
		while(true)
			if(gas>0) {
				System.out.println("달립니다.(잔량:"+gas+")");
				gas-=1;
				
				
			}
			else {
				System.out.println("멈춥니다.(잔량:"+gas+")");
				return; //메소드 실행 종료
				//린턴값은 보이드에서 break와 같은 역할을 한다.
			}
	}
}
