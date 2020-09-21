package day16;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();	//dog��ü�� �����ؼ� dogsound �ҷ���
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		System.out.println("---------");
		
		Animal animal = null;		//�߻�ü�� ������ �Ұ����ѵ� null�� �ϴ� ������ �س��� �� �ִ�. 
		animal = new Dog();			//animal��new dog�� �ڽ�Ŭ������ �־����� ���� ����� ������ �ȴ�. 
		animal.sound();				//�ڵ�Ÿ�� ��ȯ�� �Ǿ� dog�� animal�� ���� ������ ����� �� �ְ� �Ǿ���. 
		
		animal = new Cat();
		animal.sound();
		
		System.out.println("---------");
		
		animalSound(new Dog());		//�Ű������� ������! �θ� ��ü�� �Ű������� �޼ҵ忡 �ڽ�Ŭ������ ����־����� 
		animalSound(new Cat());		//�ڽ�Ŭ������ �������̵� �� ���ο� �θ�ü�� ź���Ѵ�. 
	}
	
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
