package day11;

public class Computer {
	//매개변수를 배열로 지정하게 되면 배열을 받아서 배열의 숫자만큼 매개변수를 받을 수 있다.
	int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum+= values[i];
			
		}
		return sum;	
	}
//...들어가면 받은 수 만큼 배열을 만들 수 잇다 . 갯수에 상관없이 만들 수 있음
	int sum2(int ... values) {
		int sum =0;
		for (int i=0; i<values.length; i++) {
			sum +=values[i];
			
		}
		return sum;
	
}
	
}
