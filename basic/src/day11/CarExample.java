package day11;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5);  //Car�� setGas�޼ҵ� ȣ��
		
		boolean gasState = myCar.isLeftGas(); 	//Car�� isLeftGas�޼ҵ� ȣ��
		
		if(gasState) {
			System.out.println("���");
			myCar.run();
			
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("�����ʿ����");
		
			
		}
		
		else {
			System.out.println("��������!");
		}
	}

}
