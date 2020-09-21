package day34.Collection;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {

			Member member = (Member) obj;
			return member.name.equals(name) &&(member.age==age);
		}else {
			return false;
		}
	}
	@Override
	//hashCode()는 주소이다. 해시코드를 오버라이딩하는 이유 = 객체 안에 있는 값들이 같아도 
	public int hashCode() {
		return name.hashCode() +age;	//String의 hashCode()를 이용
		
	}
}
