package day02;

public class VariableScopeExample {//������ ����
	public static void main(String[] args) {
		int v1 = 15;
		//int v2; ����ʹٸ� ���� {}���ʹ� int�� ������ �� ����
		//����� ������ �ڽ��� �� ������ ��� �� ����.
		//if �Լ��� ()�ȿ� ���� ���϶� ����Ǵ� �޼ҵ�
		
		if(v1>10) {
			int v2 = v1 -10;
			System.out.println(v2);
			
		}
		//int v2�� if �� �ȿ��� ������� ������ �ٽ� ���� ����
		int v2 =2;
		int v3 = v1+ v2 + 5;
		
		System.out.println(v3);
	}

}