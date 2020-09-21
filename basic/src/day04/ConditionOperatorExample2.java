package day04;

public class ConditionOperatorExample2 {
	public static void main(String[] args) {
		int score = 85;
		char grade = (score >90) ? 'A' : 'F';
	//논리   ?  는 한줄로 쓸 수 있는 작은 논리연산자라고 생각한다. 참이라면 물음표 바로 뒷 값. 거짓이라면 :뒷값 	
	//거짓일때 한번 더 논리연산을 하는것 가능하게 한다.
		System.out.println(score + "점은" +grade + ""+"등급입니다.");
		int score2 = 73;
		
		char grade2 = (score >90) ? 'A' : (score >80) ? 'B' :(score2>70) ? 'c' :'F';
		System.out.println(grade2);
	}

}
