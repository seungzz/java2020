package day19;

public class ThrowsExample {	//예외 떠넘기기
	public static void main(String[] args) {
		try {
			findClass();
		}catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않는다");
		}
	}
	
	public static void findClass() throws ClassNotFoundException{
		//예외 떠넘기기 catch 부분으로 던져버리겠다.
		Class clazz = Class.forName("java.lang.String2");
		
	}
}
