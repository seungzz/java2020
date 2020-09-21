package day33.Ramda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredictExample {
	private static List<Student> list = Arrays.asList(
			new Student("홍길동","남자",90),
			new Student("강승지","여자",90),
			new Student("유호성","남자",92),
			new Student("이은주","여자",95)
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
		double maleAvg = avg(t->{return t.getGendar().equals("남자");});
		System.out.println("남자평균 점수: "+maleAvg);
		
		double femaleAvg = avg( t-> 
			t.getGendar().equals("여자")
		);
		System.out.println("여자평균 점수: "+femaleAvg);
	}
}