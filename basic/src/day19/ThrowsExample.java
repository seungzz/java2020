package day19;

public class ThrowsExample {	//���� ���ѱ��
	public static void main(String[] args) {
		try {
			findClass();
		}catch(ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʴ´�");
		}
	}
	
	public static void findClass() throws ClassNotFoundException{
		//���� ���ѱ�� catch �κ����� ���������ڴ�.
		Class clazz = Class.forName("java.lang.String2");
		
	}
}
