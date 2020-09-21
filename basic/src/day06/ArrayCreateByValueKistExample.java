package day06;

public class ArrayCreateByValueKistExample {
	public static void main(String[] args) {
		int[] scores = {83,90,87};	//배열의 값은 중괄호로 묶어서 값을 선언함
		//선언만 먼저 하고 나중에 추가하고 싶을 때에는 scores = new int[]{83,90,87}을 사용한다.
		
		
		System.out.println("scores[0]: " +scores[0]);
		System.out.println("scores[1]: " +scores[1]);	
		System.out.println("scores[2]: " +scores[2]);
		
		int sum = 0;
		for(int i= 0;i<3;i++) {
			sum +=scores[i];	
		}
		System.out.println("총합= "+ sum);
		double avg = (double)sum/3;
		System.out.println("평균= "+avg);
		
		}
		
	}

