package day11;

public class Singleton {
	//정적 필드로 자기자신의 객체 생성
	private static Singleton s = new Singleton();
	
	
	// 생성자 private(접근제한자)로 생성에 접근하지 못하게 막아버림 
	//싱글톤: 자기자신을 혼자 유일하게 만들어버리는 객체이다. 
	private Singleton()	{ 
		
	}
	//싱글톤 객체는 유일하게 getInstance 메소드를 통해 기존의 객체를 불러올 수 있음
	static Singleton getInstance() {
		
		
		
		
		return s;		//static이기 때문에 바로 사용할 수 있다.
		//항상 같은 객체가 불려온다.
		//setInstance()를 사용하면 수정할 수 있다. <- final과 다른 경우
	}
}
