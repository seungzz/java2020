package day33.Ramda;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	//intBinaryOperator의 applyAsInt(int,int)는 두개의 int를 연산한다.
	private static int[] scores = {92,95,42};
	
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		//처음 result 값은 92로 저장
		for(int score : scores) {
			//score는 scores에서 뽑아낸다. for문을 돌려서 계속 뽑아낸다. 처음에 92를 뽑아냄
			result = operator.applyAsInt(result, score);
		}
		return result;
	}
	
	public static void main(String[] args) {
		//최대값 얻기
		int max = maxOrMin(		//maxOrMin의매개식으로 람다식이 들어간다.
				(a,b) -> {
					if(a>=b) return a;
					else return b;
				});
			System.out.println("최대값: "+max);
			
			//최소값 얻기
			int min = maxOrMin(
					(a,b) -> {
						if(a>=b) return b;
						else return a;
					});
				System.out.println("최소값: "+min);
	}
}
