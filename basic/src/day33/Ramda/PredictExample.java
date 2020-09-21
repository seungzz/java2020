package day33.Ramda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredictExample {
	private static List<Student> list = Arrays.asList(
			new Student("ȫ�浿","����",90),
			new Student("������","����",90),
			new Student("��ȣ��","����",92),
			new Student("������","����",95)
);
	public static double avg(Predicate<Student> predicate) {
		int count =0, sum =0;
		for(Student student :list) {
			if(predicate.test(student)) {
				count++;
				sum +=student.getScore();
			}
		}
		return (double)sum/count;
	}
	public static void main(String[] args) {
		double maleAvg = avg(t->{return t.getGendar().equals("����");});
		System.out.println("������� ����: "+maleAvg);
		
		double femaleAvg = avg( t-> 
			t.getGendar().equals("����")
		);
		System.out.println("������� ����: "+femaleAvg);
	}
}