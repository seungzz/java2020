package day31.Generic;

public class ProductExample {
	public static void main(String[] args) {
		Product<Tv,String> product1 = new Product<Tv, String>();
		product1.setKind(new Tv());
		product1.setModel("스마트TV");
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		//타입 변환 없이 쉽게 넣고 빼고 할 수 있다.
		
		Product<Car,String> product2 = new Product<Car, String>();
		product2.setKind(new Car());
		product2.setModel("디젤");
		Car car = product2.getKind();
		String carModel = product2.getModel();
	}
}

class Tv{}
class Car{}
