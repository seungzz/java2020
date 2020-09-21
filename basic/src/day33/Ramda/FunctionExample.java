package day33.Ramda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample {
	private static List<Student> List = Arrays.asList(
			new Student("ȫ�浿",90,95),
			new Student("�ſ��",95,93)
			);
	
	public static void printString (Function<Student,String> function) {
		for(Student student : List) {
			System.out.println(function.apply(student)+" ");
		}
		System.out.println();
	}
	public static void printInt(ToIntFunction<Student> function) {
		//T������ ��ü�� int�� ��ȯ�ؼ� ��ȯ�Ѵ�.
		for(Student student : List) {
			System.out.println(function.applyAsInt(student)+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("[�л��̸�]");
		printString(t->t.getName());
		
		System.out.println("[��������]");
		printInt(t -> t.getEnglishScore());
		
		System.out.println("[��������]");
		printInt(t ->t.getMathScore());
	}
}	
