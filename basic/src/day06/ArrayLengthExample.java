package day06;

public class ArrayLengthExample {	//�迭�� ����Ҷ� �����Ѱ� ; ������.length ->�迭�� ���̸� ����Ѵ�.,                                   
	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		int sum = 0;
		for(int i=0; i<scores.length; i++ ) {
			sum += scores[i];
		}
		System.out.println("����: " +sum);
		
		double avg = (double)sum/scores.length;
		System.out.println("���: "+ avg);
		
		
	}
}
