package day16.interface01;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;	//�������̽��� �߻� Ŭ������ ����� ���� ����(�ܵ���� �Ұ�, ���� ��ü�� ���ĵ� �����)
		rc = new Television();
		rc = new Audio();
	}

}
