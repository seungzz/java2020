package day32.Generic;

import java.util.Arrays;

public class WildCardExample {
									//코스에 제네릭 물음표 ->무엇을 넣어도 된다.
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + "수강생: "+Arrays.toString(course.getStudents()));
	}
									//? extends Student->student에 상속받은 애들만 받을 수 있어
	
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + "수강생: "+Arrays.toString(course.getStudents()));
	}
												//워커와 워커의 부모만 사용할 수 있다.
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + "수강생: "+Arrays.toString(course.getStudents()));
	}
	
	
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("일반인 과정",5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		
		Course<Worker> workerCourse = new Course<Worker>("직장인과정",5);
		workerCourse.add(new Worker("직장인"));
		
		Course<Student> studentCourse = new Course<Student>("학생과정",5);
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));
		
		Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생과정",5);
		
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		//Course<? extends Student?이기 때문에 Student와 그것을 상속한 HighStudent만 매개변수로 사용가능하다.
		System.out.println();
		
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
		registerCourseStudent(studentCourse);
		
	}
}
