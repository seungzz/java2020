package day25;

public class CalculateRates {
	public static void main(String[] args) throws Exception {
		CalculateRates calculateRates = new CalculateRates();

		// 비율 결과: 6.0%, 2.0%, 12.0%, 49.0%, 31.0%
		calculateRates.calculate(new int[] { 10, 30, 20, 80, 50 });

		// 비율 결과: 20.0%, 20.0%, 20.0%, 20.0%, 20.0%
		calculateRates.calculate(new int[] { 50, 50, 50, 50, 50 });

		// 비율 결과: 7.0%, 13.0%, 20.0%, 27.0%, 33.0%
		calculateRates.calculate(new int[] { 1, 2, 3, 4, 5 });
	}
	
	// 구현
	public void calculate(int[] nums) throws Exception {
		
		float sum=0;
		float ratio = 0;
		
		for(int i=0; i<nums.length; i++) {
			sum = sum+ nums[i];
			
			
		
	
		}for (int i=0; i<nums.length; i++) {
			
			ratio = nums[i]/sum*100;
			System.out.println();
			
			for(int k=0; k<Math.round(ratio); k++) {
				System.out.print("*");
			}	
			
			double a = Math.round(ratio);
			System.out.print("(");
			System.out.printf("%.1f%%",a);
			System.out.print(")");		}
		
	}
}