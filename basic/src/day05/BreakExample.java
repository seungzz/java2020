package day05;

public class BreakExample {
	public static void main(String[] args) {
		while(true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			
			if(num==6) {
				break; //while�ȿ� while�� �־��µ� ���� ������ �־��ٸ� ���� ū while�� ���������� ����.
					   //while�� �ΰ� �ִٸ� �ٸ� ����� �����غ�����->������
				
			}
		}
		System.out.println("����");
	}

}
