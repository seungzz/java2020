package day05;

public class WhilekeyControlExample {
	public static void main(String[] args) throws Exception {
		int speed = 0;
		int keycode =0;
		
		boolean run = true;
		
		while(run) {
			
			
			if(keycode!=13 && keycode!=10) { //���Ϳ��� �ƽ�Ű�ڵ尡 �ִ�. ���� �Է�������
				//13=ĳ��������  -> �Ǿ��ٷ� �̵��Ѵ�
				//10=�����ǵ�  -> ���� ������ �������� �� �ΰ��� ������ ���͸� �������� �̷�����°�.
				//���͸� �Է��ϴ� �����ε� ������ ���� ���� 1.�����Է��Ѱ� 2.ĳ�������� 3.�����ǵ�
				//while���� ��� �������� ����. ������ 13�� 10�϶��� ���� �ȱ� ������ ���ǹ����� �ɾ�δ°�
				
				
				System.out.println("-----------");
				System.out.println("1.����  |  2.����  |  3.����");
				System.out.println("����: ");
				
			}
			
			keycode = System.in.read();
			//�ѹ��� �Ѱ��� �����͹ۿ� �����ۿ� ����
				speed++;
				System.out.println("����ӵ�=" + speed);
				
			} if(keycode==50) {
				speed--;
				System.out.println("����ӵ�=" +speed);
			}else if(keycode==51) {
				run = false;
			}
		
		System.out.println("���α׷� ����");
	}
}
