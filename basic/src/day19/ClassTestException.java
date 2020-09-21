package day19;

public class ClassTestException {
	public static void main(String[] args) {
	Dog dog = new Dog();
	changeDog(dog);
	
	Cat cat = new Cat();
	changeDog(cat);
	
	}
	public static void changeDog(Animal animal) {
		Dog dog = (Dog) animal;
	}
}
