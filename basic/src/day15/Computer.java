package day15;

public class Computer extends Calculator{
	
	
	@Override
	double areaCircle(double r) {	//�������̵��� �ߴµ� areaCircle�� �״�� �θ� ���� ���� ���� ���·� ���� ������ �������
		System.out.println("Computer ��ü�� areaCircle()����");
		return Math.PI*r*r;
	
	}

}
