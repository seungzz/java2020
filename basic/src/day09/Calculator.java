package day09;

public class Calculator {

	//�޼ҵ�
	void powerOn() {
		System.out.println("������ �մϴ�.");
		//void�� ������ �ƹ� ���ϰ��� ��� ����
		
	}
	
	int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x/(double)y;
		return result;
	}
	
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
}
