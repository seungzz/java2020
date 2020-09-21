package day32.Generic;

public class ChildProductAndStorageExample {
	public static void main(String[] args) {
		ChildProduct<Tv,String, String> product = new ChildProduct<>();
		//new ChildProduct<>처럼 <>안에 들어가는 제네릭을 생략 가능합니다.
		
		product.setKind(new Tv());
		product.setModel("SmartTv");
		product.setCompany("Samsung");
		
		Storage<Tv> storage = new StorageImpl<Tv>(100);
		storage.add(new Tv(),0);
		Tv tv = storage.get(0);
	}
}
