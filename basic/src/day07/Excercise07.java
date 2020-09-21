package day07;

public class Excercise07 {
	public static void main(String[] args) {
		//주어진 배열의 최댓값이 출력되는 프로그램을 만들어보세요.
		int max = 0;
		int[] array = {1,5,3,8,2};
		
		
		for(int i=0; i<array.length; i++) {
			

			if(max<array[i]) {
				max = array[i];
			}
		}
		
		System.out.println("max:"+max);
		
		
	}
}
