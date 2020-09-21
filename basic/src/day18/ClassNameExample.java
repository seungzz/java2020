package day18;

public class ClassNameExample {	
	public static void main(String[] args) {
		//NestedClassName ncn = new NestedClassName();
		//중첩된 클래스는 중첩되기 전의 클래스를 만들기 전에는 바로 만들 수 없다.
		
		ClassName cn = new ClassName();
		//ClassName.NestedClassName nc = cn.new NestedClassName();
		
		//nc.i = i;	//일단 객체를 만들고 나면 일반 클래스처럼 메소드와 필드를 불러올 수 있다.
	}

}
