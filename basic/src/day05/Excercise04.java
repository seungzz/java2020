package day05;

public class Excercise04 {
	public static void main(String[] args) {
		//while���� Math.random()�޼ҵ带 �̿��ؼ� �ΰ��� �ֻ����� �������� ������ ����(��1,��2)���·� ����ϰ�
		//���� ���� 5�� �ƴϸ� �ֻ����� ��� ������, 5�� ������ ���ߴ� �ڵ�
		
		
			 while(true) {
				 
				int num1=(int)(Math.random()*6)+1;
				int num2=(int) (Math.random()*6)+1;
				 System.out.println((num1)+","+(num2));
				
				 if (num1+num2==5) {
					 
					 break;
					 
				 }
			
			 }
			
	}

}