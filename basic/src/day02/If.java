package day02;

public class If {
	public static void main(String[] args) {
		int v1 = 15;
		int v2 ;
		//if �Լ��� ()�ȿ� ���� ���϶� ����Ǵ� �޼ҵ�
		if(v1>10) {
			v2 = v1 -10;
			System.out.println("�����϶� ����");
			
		}else {
			System.out.println("�����϶� ����");
			v2 = 4444; //else���� v2�� ���������� ������ �Ʒ� println �������.
		}
		System.out.println("�����ǽ���");
		System.out.println(v2);
	}

}