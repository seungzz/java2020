package day04;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "�Ź�ö";	//�ּ�1�� ����
		String strVar2 = "�Ź�ö";	//�ּ�1�� ����(���� �����Ƿ�)
		String strVar3 = new String("�Ź�ö"); 	//���ο� ��ü�� �����Ѵ�. ���ο� �ּҿ� ������.
		
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);
		
		
		
		
		System.out.println();
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3)); //��Ʈ���� �ּҸ� ���ϴ� Ư���� ��찡 �ƴϸ� ������ equals���
	}

}
