package day28;

import java.text.DecimalFormat;

public class DecimalFormatExample {
	public static void main(String[] args) {
		double num = 1234567.89;
		
		DecimalFormat df = new DecimalFormat("0");
		 System.out.println(df.format(num));	//반올림이 되어 정수까지 출력됨
		 
		 df = new DecimalFormat("0.0");
		 System.out.println(df.format(num));
		 
		 df = new DecimalFormat("0000000000.0000");	//비어있는 자리는 0 으로 출력됨
		 System.out.println(df.format(num));
		 
		 df = new DecimalFormat("#");	
		 System.out.println(df.format(num));	//반올림되어 정수까지 출력됨
		 
		df = new DecimalFormat("##########.####");
		System.out.println(df.format(num));     //0으로 채워지는 것이 없이 비어있는 부분은 비어있게 출력	
		
		
		df = new DecimalFormat("#.0");
		System.out.println(df.format(num));		//소수점 한자리에서 반올림해서 출력
		
		
		df = new DecimalFormat("+#.0");
		System.out.println(df.format(num)); 	//양수인지 음수인지 특수한 상황에서 쓸 수 있음
		
		
		df = new DecimalFormat("-#.0");
		System.out.println(df.format(num)); 	//-가 붙여져서 출력	
		
		
		df = new DecimalFormat("#,###.0");
		System.out.println(df.format(num)); 	//세자리마다 끊어져서 출력	
		
		
		df = new DecimalFormat("0.0E0");
		System.out.println(df.format(num));
		
		
		//df = new DecimalFormat()
	}
}
