package day04;

public class QQLogicalOperatorExample {
	public static void main(String[] args) {
		int charCode = 'f';
		
		if((charCode>=65) & (charCode<=90)) {
			System.out.println("대문자군");
		
		}
		
		if((charCode>=97) && (charCode<=122)) {
			System.out.println("소문자군");
		} 
		
		if ((charCode<48) && ! (charCode>57)) {
			System.out.println("0-9숫자군");
	}
		int value = 6;
		
		if ((value%2==0) | (value%3==0)) {
			System.out.println("2또는 3의 배수");
		}
		if((value%2==0) || (value%3==0)) {
			System.out.println("2또는 3의배수");
		}
}

}