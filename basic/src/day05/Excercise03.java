package day05;

public class Excercise03 {
	public static void main(String[] args) {
		//for���� �̿��ؼ� 1���� 100������ �����߿��� 3�� ����� ������ ���ϴ� �ڵ带 �ۼ��ϼ���
		int sum = 0;
		for(int i = 1; i<=100; i++) {
			if (i%3 ==0) {
				sum = sum+i;
			}
		}
		System.out.println(sum);
			
	}

}
