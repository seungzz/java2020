package day20;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("����", "�ȵ���̵�");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);  //smartPhone��ü���� �������̵��� toString()�� ���� String�� ���� �����
		
		System.out.println(myPhone); //smartPhone��ü�� �ٷ� println���� ���
	}
}
