package day11;

public class Person {	//final은 값이 정해지면 값이 바뀌지 않을때 쓴다.
	final String nation = "Korea";
	final String ssn;
	String name;
	
	
	
	//static이 붙은 final은 한개의 변수만 된다. 
	//초기에 값을 넣는것 빼고는 값을 수정할 수 없다. 
	
	
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
