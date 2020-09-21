package day21;

public class Member2 implements Cloneable{
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	public Member2(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	public Member2 getMember() {
		Member2 cloned = null;
		try {
			cloned = (Member2) clone();		//클론 메소드를 사용할 때에는 try를 통해서 예외처리를 해야한다.
			
    	}catch (CloneNotSupportedException e) {}
		return cloned;
	}
}
