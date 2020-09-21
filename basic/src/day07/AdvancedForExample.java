package day07;

public class AdvancedForExample {
	public static void main(String[] args) {
		int[] scores = {95,71,84,93,87};
		
		int sum =0;
		for(int score : scores) {	//for문 중에 배열을 뺄 수 있도록 만든것.
								   //새로만든 변수에 for문이 돌 때(배열끝날때까지) 그 값이 저장
			sum = sum +score;
		
			//for(int i=0; i<scores.length;i++) {
			// sum = sum+scores[i];
		}
		System.out.println("점수총합 :"+sum);
		
		double avg = (double)sum/scores.length;
		System.out.println("점수평균 = "+avg);
	}

}
