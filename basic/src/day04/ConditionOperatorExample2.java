package day04;

public class ConditionOperatorExample2 {
	public static void main(String[] args) {
		int score = 85;
		char grade = (score >90) ? 'A' : 'F';
	//��   ?  �� ���ٷ� �� �� �ִ� ���� �������ڶ�� �����Ѵ�. ���̶�� ����ǥ �ٷ� �� ��. �����̶�� :�ް� 	
	//�����϶� �ѹ� �� �������� �ϴ°� �����ϰ� �Ѵ�.
		System.out.println(score + "����" +grade + ""+"����Դϴ�.");
		int score2 = 73;
		
		char grade2 = (score >90) ? 'A' : (score >80) ? 'B' :(score2>70) ? 'c' :'F';
		System.out.println(grade2);
	}

}
