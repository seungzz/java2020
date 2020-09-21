package day19;

public class TryCatchFinallyExample {//예외처리하는 방법1.try catch 이용
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
		}catch (ClassNotFoundException e) {
			System.out.println("클래스존재x");
		}
	}
}
