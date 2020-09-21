package day24;


public class Exam01 {
	public static void main(String[] args) {
		Exam01 ex01 = new Exam01();
		long number = 228754462;
		System.out.println( "입력 숫자 = " + number );		
		System.out.println("2 횟수 => " + ex01.countNumber(number, 2));//3을 리턴
		System.out.println("4 횟수 => " + ex01.countNumber(number, 4));//2를 리턴
		
	}
	

		
		
	public int countNumber(long number, int i){
		String str = String.valueOf(number);
		int length = str.length();
		int sum = 0;

		for(int k=0; k<length; k++) {
			char a = str.charAt(k);
			if(String.valueOf(a).equals(String.valueOf(i))) {
				sum++;
			}
				
			
			
		}
		return sum;
}
	
}
