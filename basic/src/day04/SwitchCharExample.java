package day04;

public class SwitchCharExample {
	public static void main(String[] args) {
		char grade = 'B';  //�翬�� ��Ʈ���� ������?
		
		switch(grade) {
		case 'A':
		case 'a': 
			System.out.println("���ȸ��");
			break;
		case 'B':
		case 'b':
			System.out.println("�Ϲ�ȸ��");
			break;
		default :
			System.out.println("�մ��Դϴ�.");
		}
	}

}
