package day23;

public class ClassExample {
	public static void main(String[] args) {
		Car car = new Car();
		Class clazz1 = car.getClass();		//생성자로 생성할 수 없는 객체이다.
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage());
		System.out.println();
		
		try {
			Class clazz2 = Class.forName("day23.Car");	//만들지 않은 클래스를 .이하에 있다면 exception
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage());
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
