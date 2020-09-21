package day23;

public class ClassExample {
	public static void main(String[] args) {
		Car car = new Car();
		Class clazz1 = car.getClass();		//�����ڷ� ������ �� ���� ��ü�̴�.
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage());
		System.out.println();
		
		try {
			Class clazz2 = Class.forName("day23.Car");	//������ ���� Ŭ������ .���Ͽ� �ִٸ� exception
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage());
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
