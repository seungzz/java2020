package day19;

public class TryCatchFinallyExample {//����ó���ϴ� ���1.try catch �̿�
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
		}catch (ClassNotFoundException e) {
			System.out.println("Ŭ��������x");
		}
	}
}
