package day04;

public class ConditionOperationTest {
	public static void main(String[] args) {
		//상황 연산자를 사용해서 90점 이상이면 A
		//80점 이상은 B 70점 이상은 C 나머지는 F인 프로그램을 만드세요
		
		int score = 30;
		char grade = (score>=90) ?'A': (score>=80) ? 'B' :(score>=70) ? 'C':'F'; 
		
		System.out.println(grade);
		
		
	}

}
