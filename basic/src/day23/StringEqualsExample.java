package day23;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = new String("������");	//new�� ������� ��ü�� �׻� �ٸ� String��ü�� �����Ѵ�.
		String strVar2 = "������";
		
		if(strVar1 == strVar2) {
			System.out.println("���� ��ü����");
			
		}else {
			System.out.println("�ٸ� ��ü ����");
			
		}
		if(strVar1.equals(strVar2)) {
			System.out.println("���� ���ڿ�");
		}else {
			System.out.println("�ٸ� ���ڿ�");
		}
	}
}
