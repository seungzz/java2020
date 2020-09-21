package day16;

public abstract class Animal {
	public String kind;
	
	public void breath() {
		System.out.println("숨쉰다");
		
	}
	
	public abstract void sound(); //추상 클래스는 그냥 이러게 쓰임

}
