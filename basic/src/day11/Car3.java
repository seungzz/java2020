package day11;

public class Car3 {

	String model;
	int speed;
	//this.�� ������ �ڱⰡ ���� ������ �޼ҵ带 ����� �� �ִ�.
	Car3(String model) {
		this.model = model;
	//���������� field�� ������ �ִ°� ���̶�� this.model=modeló�� ���ƺ��̴�! ������ ����. �Ϻη� �� (�ٸ����� ��Ÿ���� ����)
	//�� model�� this.model�� ���� ���̴�. 
		
		
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i=10; i<=50; i++)
			this.setSpeed(i);
		System.out.println(this.model +"�� �޸��ϴ�.(�ü�:" +this.speed +"km/h)");
	}
}
