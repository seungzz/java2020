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
	//hashCode()�� �ּ��̴�. �ؽ��ڵ带 �������̵��ϴ� ���� = ��ü �ȿ� �ִ� ������ ���Ƶ� 
	public int hashCode() {
		return name.hashCode() +age;	//String�� hashCode()�� �̿�
		
	}
}
