package day38.IO2;

public class PrintExample {
	public static void main(String[] args) {
		System.out.printf("��ǰ�ǰ���: %d��\n", 123);
		System.out.printf("��ǰ�� ����: %6d��\n",123);
		//%6d�� �����ڸ�, ���� ������ �����
		System.out.printf("��ǰ�� ����: %06d��\n",123);
		//%06d�� �����ڸ�, ���� ������ 0���� ä���ش�.
		System.out.printf("��ǰ�� ����: %-6d��\n",123);
		//�����ڸ�, �������� �� �������� �Ѵ�. 
		
		
		System.out.printf("��������%d�� ���� ����: %10.2f\n",10,Math.PI*10*10);
		//��ü �ڸ��� 10�ڸ� (�Ҽ��� �ڸ������� 7�ڸ�) �Ҽ��� �ڸ��� 2�ڸ� ���� ���ڸ� ����
	}
}
