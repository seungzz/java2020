package day16;

public abstract class Chicken {
	String origin; double taste;

	abstract void cook();
	
	
	
}
//�߻�Ŭ������ ����Ϸ��� �������̵� �����־�� �Ѵ�!

class Crispychicken extends Chicken {
	
	@Override
	void cook() {}
	boolean isCrispy;
	void cookWithOil() {
		this.taste +=5;
		System.out.println("�⸧�� Ƣ���.");
		isCrispy = true;
	}
}

class SweetSauceChicken extends Chicken {
	boolean isSweet;
	void cookWithSauce() {
		this.taste +=4;
		System.out.println("���ġŲ");
		isSweet = true;
	}
	@Override
	void cook() {
		
	}
}
