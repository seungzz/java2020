package day09;

public class Car {
	//�ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	//������: �̸��� Ŭ������ �Ȱ��� �޼ҵ�
	//�����ڴ� ��ü�� �����Ҷ� �ڵ����� ����Ǵ� �޼ҵ��Դϴ�.
	//������ �����ε��� �̹� �����ڰ� ������ ���� �Ű�
	Car() {
	
	}
	
	Car(String model) {
		this.model = model;
	}

	Car(String model, String color) {
		this.model = model;
		this.color = color;
		
		
	}
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	
}
}