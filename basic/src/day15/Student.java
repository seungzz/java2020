package day15;

public class Student extends People{
	public int studentNo;
	
	public Student(String name, String ssn, int i) {
		super(name, ssn);	//부모생성자를 super를 통해서 호출된다. 부모클래스를 호출하는것
		this.studentNo = i;
		
		
	}
}
