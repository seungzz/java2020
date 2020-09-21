package day32.Generic;

public class Course<T> {
	private String name;
	private T[] students;
	
	public Course(String name, int capacity) {
		this.name = name;
		students = (T[]) (new Object[capacity]);
		//타입 파라미터로 배열을 생성하려면 new T[n] 형태로 뱅ㄹ을 생성하는 대신에
		//(T[])(new Object[n])으로 생성해야 합니다.
	}
	public String getName() {return name;}
	public T[] getStudents() {return students;}
	
	public void add(T t) {
		for(int i=0; i<students.length; i++) {
			//배열에 미어있는 부분을 찾아서 수강생을 추가하는 메소드
			if(students[i] == null) {
				students[i] =t;
				break;
			}
		}
	}
}
