package day11;

public class Car3 {

	String model;
	int speed;
	//this.을 찍으면 자기가 가진 변수와 메소드를 사용할 수 있다.
	Car3(String model) {
		this.model = model;
	//관례적으로 field가 가지고 있는게 모델이라면 this.model=model처럼 같아보이는! 것으로 쓴다. 일부러 씀 (다른것을 나타내기 위해)
	//이 model은 this.model에 들어가는 값이다. 
		
		
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i=10; i<=50; i++)
			this.setSpeed(i);
		System.out.println(this.model +"가 달립니다.(시속:" +this.speed +"km/h)");
	}
}
