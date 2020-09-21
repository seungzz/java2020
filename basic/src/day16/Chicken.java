package day16;

public abstract class Chicken {
	String origin; double taste;

	abstract void cook();
	
	
	
}
//추상클래스를 사용하려면 오버라이드 시켜주어야 한다!

class Crispychicken extends Chicken {
	
	@Override
	void cook() {}
	boolean isCrispy;
	void cookWithOil() {
		this.taste +=5;
		System.out.println("기름에 튀겼다.");
		isCrispy = true;
	}
}

class SweetSauceChicken extends Chicken {
	boolean isSweet;
	void cookWithSauce() {
		this.taste +=4;
		System.out.println("양념치킨");
		isSweet = true;
	}
	@Override
	void cook() {
		
	}
}
