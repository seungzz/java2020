package day09;

public class Car2 {



	//�ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	//������: �̸��� Ŭ������ �Ȱ��� �޼ҵ�
	//�����ڴ� ��ü�� �����Ҷ� �ڵ����� ����Ǵ� �޼ҵ��Դϴ�.
	//������ �����ε��� �̹� �����ڰ� ������ ���� �Ű�
	Car2() {
	
	}
	
	Car2(String model) {
		this(model, "����", 250);
		//������ �Ű������� �����ڸ� �ҷ��� �� �ִ�
		//���� string�Ű����� �ϳ��� ���� ������ 3���� ����Ʈ�� ����� ���ڴ�.
		//��, model���� �޶����� �ٸ����� ������ ������ ���´�..
		
		//�ڵ带 �ٿ��� �� �� ����
	}	

	Car2(String model, String color) {
		this.model = model;
		this.color = color;
		
		
	}
	Car2(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	//���� ���� ���ٸ�  ù��° car2(String model)�� ����� �� ���� -> ȣ���߱⶧����
}
}

