package day03;

public class CheckOverFlowExample {
	public static void main(String[] args) {
		long left = -2000000000;
		long right = 2000000000;
		
		//int�� ������ �����Ѵٸ� �̹� �����÷ο찡 �Ǿ� if�� ������ �� ����.
		
		System.out.println("����"+(left-right));
		System.out.println("����"+Integer.MAX_VALUE);
		System.out.println("����"+Integer.MIN_VALUE);
		
		
		
		
		
		
		if((right>0)) {
			if((left-right)<Integer.MIN_VALUE) {
				
				System.out.println("�����ÿ�߻�");
			}
			
		
				}else {
					System.out.println("���鼭 �ϼ���");
				}
		
			}
			
				
	}


