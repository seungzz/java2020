package day33.Ramda;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class FunctionExample2 {
	private static List<Student> list = Arrays.asList(
			new Student("홍길동",90,96),
			new Student("신용권",95,93)
			);
	public static double avg(ToIntFunction<Student>function) {
		//T형식의 객체를 int로 반환
		
		int sum = 0;
		for(Student student : list) {
			sum += function.applyAsInt(student);
		}
		double avg = (double)sum/list.size();
		return avg;
	}
	public static void main(String[] avg) {
		double englishAvg = avg(s -> s.getEnglishScore());
		System.out.println("영어평균점수: "+englishAvg);
		
		double mathAvg = avg(s -> s.getEnglishScore());
		System.out.println("수학평균점수: "+mathAvg);
	}
}
