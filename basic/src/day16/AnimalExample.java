package day16;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();	//dog개체를 생성해서 dogsound 불러냄
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		System.out.println("---------");
		
		Animal animal = null;		//추상객체는 생성이 불가능한데 null로 일단 생성을 해놓을 수 있다. 
		animal = new Dog();			//animal에new dog로 자식클래스를 넣었더니 들어가고 제대로 실행이 된다. 
		animal.sound();				//자동타입 변환이 되어 dog가 animal로 들어갔기 때문에 사용할 수 있게 되었다. 
		
		animal = new Cat();
		animal.sound();
		
		System.out.println("---------");
		
		animalSound(new Dog());		//매개변수의 다형성! 부모 객체가 매개변수인 메소드에 자식클래스를 집어넣었더니 
		animalSound(new Cat());		//자식클래스에 오버라이드 된 새로운 부모객체가 탄생한다. 
	}
	
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
