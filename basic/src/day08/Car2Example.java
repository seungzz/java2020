package day08;

public class Car2Example {
	public static void main(String[] args) {
		Car2 car = new Car2();
		System.out.println("car.c=" + car.c);
		System.out.println("car.color" + car.color);
		
		Car2 car2 = new Car2("Èò»ö", 1);
		System.out.println("car2.c = "+car2.c);
		System.out.println("car2.color = " +car2.color);
	}
}
