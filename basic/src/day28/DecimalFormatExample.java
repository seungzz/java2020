package day28;

import java.text.DecimalFormat;

public class DecimalFormatExample {
	public static void main(String[] args) {
		double num = 1234567.89;
		
		DecimalFormat df = new DecimalFormat("0");
		 System.out.println(df.format(num));	//�ݿø��� �Ǿ� �������� ��µ�
		 
		 df = new DecimalFormat("0.0");
		 System.out.println(df.format(num));
		 
		 df = new DecimalFormat("0000000000.0000");	//����ִ� �ڸ��� 0 ���� ��µ�
		 System.out.println(df.format(num));
		 
		 df = new DecimalFormat("#");	
		 System.out.println(df.format(num));	//�ݿø��Ǿ� �������� ��µ�
		 
		df = new DecimalFormat("##########.####");
		System.out.println(df.format(num));     //0���� ä������ ���� ���� ����ִ� �κ��� ����ְ� ���	
		
		
		df = new DecimalFormat("#.0");
		System.out.println(df.format(num));		//�Ҽ��� ���ڸ����� �ݿø��ؼ� ���
		
		
		df = new DecimalFormat("+#.0");
		System.out.println(df.format(num)); 	//������� �������� Ư���� ��Ȳ���� �� �� ����
		
		
		df = new DecimalFormat("-#.0");
		System.out.println(df.format(num)); 	//-�� �ٿ����� ���	
		
		
		df = new DecimalFormat("#,###.0");
		System.out.println(df.format(num)); 	//���ڸ����� �������� ���	
		
		
		df = new DecimalFormat("0.0E0");
		System.out.println(df.format(num));
		
		
		//df = new DecimalFormat()
	}
}
