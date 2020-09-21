package day09;

public class Car2 {



	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자: 이름이 클래스와 똑같은 메소드
	//생성자는 객체를 생성할때 자동으로 실행되는 메소드입니다.
	//생성자 오버로딩은 이미 생성자가 있지만 들어가는 매개
	Car2() {
	
	}
	
	Car2(String model) {
		this(model, "은색", 250);
		//세개의 매개변수의 생성자를 불러올 수 있다
		//나는 string매개변수 하나를 쓰고 싶은데 3개를 디폴트로 만들어 놓겠다.
		//즉, model값만 달라지고 다른것은 디폴드 값으로 놓는다..
		
		//코드를 줄여서 쓸 수 잇음
	}	

	Car2(String model, String color) {
		this.model = model;
		this.color = color;
		
		
	}
	Car2(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	//위의 것이 없다면  첫번째 car2(String model)을 사용할 수 없다 -> 호출했기때문에
}
}

