package day11;

public class SingletonExamle {
	public static void main(String[] args) {
		//Singleton obj1 = new Singleton();
		//Singleton obj2 = new Singleton();    접근이 되지 않음. private로 가려놨기 때문.
		
		
		
		
		
		
		Singleton obj3 = Singleton.getInstance();
		Singleton obj4 = Singleton.getInstance();
		
		if(obj3==obj4) {		//equals안써도 아예 똑같기 때문에 같은 싱글톤이라고 나온다.
			System.out.println("같은 싱글톤객체");
		}
		else {
			System.out.println("다른 싱글톤객체");
		}
	}
}
