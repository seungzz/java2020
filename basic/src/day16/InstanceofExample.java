package day16;

public class InstanceofExample {
	
	public static void method1(Parent parent) {
		if(parent instanceof Child) {	//instanceof는 child로 만들어졌는지 아닌지 검사를 해준다. 
										//강제로 형변환 하기 전에 확인해줄 수 잇다. 
			Child child = (Child) parent;
			System.out.println("method1-Child로 변환 성공");
		}else {
			System.out.println("method1-Child로 변환 실패");
		}
	}
	
	public static void method2(Parent parent) {
		System.out.println("method2-Child로 변환 성공");
	}
	public static void main(String[] args) {
		Parent parentA = new Child();	//child객체로 parent 객체를 만들어서 강제 형변환해도 형변환이 된다.
		method1(parentA);
		method2(parentA);
		
		
		Parent parentB = new Parent();	
		method1(parentB);
		method2(parentB);	//parent만 만들었기 때문에 예외 발생
	}
}
