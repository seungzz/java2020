package day18;

public class AExample {
	public static void main(String[] args) {
		A.C c = new A.C();
		
		c.field1 = 2;	//�ν��Ͻ� �ʵ� ��� (��ü�� ������ �ҷ��Դ�.)
		c.method();
		
		
		A.C.field2 = 3;		//��ø�� �����ʵ���
		A.C.method2();		//��ø�� �����޼ҵ� ���
		
		
		A.i = 2;			//�����ʵ�� ����
		A.method3();        //�����޼ҵ���
	}
	
}
