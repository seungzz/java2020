package day33.Ramda;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	//intBinaryOperator�� applyAsInt(int,int)�� �ΰ��� int�� �����Ѵ�.
	private static int[] scores = {92,95,42};
	
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		//ó�� result ���� 92�� ����
		for(int score : scores) {
			//score�� scores���� �̾Ƴ���. for���� ������ ��� �̾Ƴ���. ó���� 92�� �̾Ƴ�
			result = operator.applyAsInt(result, score);
		}
		return result;
	}
	
	public static void main(String[] args) {
		//�ִ밪 ���
		int max = maxOrMin(		//maxOrMin�ǸŰ������� ���ٽ��� ����.
				(a,b) -> {
					if(a>=b) return a;
					else return b;
				});
			System.out.println("�ִ밪: "+max);
			
			//�ּҰ� ���
			int min = maxOrMin(
					(a,b) -> {
						if(a>=b) return b;
						else return a;
					});
				System.out.println("�ּҰ�: "+min);
	}
}
