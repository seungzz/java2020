package day06;

public class ArrayLengthExample {	//배열을 사용할때 유용한것 ; 변수명.length ->배열의 길이를 출력한다.,                                   
	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		int sum = 0;
		for(int i=0; i<scores.length; i++ ) {
			sum += scores[i];
		}
		System.out.println("총합: " +sum);
		
		double avg = (double)sum/scores.length;
		System.out.println("평균: "+ avg);
		
		
	}
}
