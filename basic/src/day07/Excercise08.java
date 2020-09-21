package day07;

public class Excercise08 {
	public static void main(String[] args) {
		// 주어진 배열의 전체 항목의 합과 평균 값을 구해보세요.

		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

		int sum = 0;
		double avg = 0.0;
		int j = 0;

		for (int i = 0; i < array.length; i++) {
			for (int k = 0; k < array[i].length; k++) {
				sum = sum + array[i][k];  //sum+=array[i][k]
				j = j + 1;  //j++
				avg = (double) sum / j;

			}

		}

		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);

	}
}
