package day24;


public class Exam01 {
	public static void main(String[] args) {
		Exam01 ex01 = new Exam01();
		long number = 228754462;
		System.out.println( "�Է� ���� = " + number );		
		System.out.println("2 Ƚ�� => " + ex01.countNumber(number, 2));//3�� ����
		System.out.println("4 Ƚ�� => " + ex01.countNumber(number, 4));//2�� ����
		
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
