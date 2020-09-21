package day18;

public class AExample {
	public static void main(String[] args) {
		A.C c = new A.C();
		
		c.field1 = 2;	//인스턴스 필드 사용 (객체를 위에서 불러왔다.)
		c.method();
		
		
		A.C.field2 = 3;		//중첩된 정적필드사용
		A.C.method2();		//중첩된 정적메소드 사용
		
		
		A.i = 2;			//정적필드로 접근
		A.method3();        //정적메소드사용
	}
	
}
