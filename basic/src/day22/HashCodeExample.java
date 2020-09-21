package day22;

import java.util.Objects;

public class HashCodeExample {
	
	public static void main(String[] args) {
		Studnet s1 = new Studnet(1,"홍길동");
		Studnet s2 = new Studnet(1,"홍길동");
		System.out.println(s1.hashCode());
		System.out.println(Objects.hashCode(s2));
	}
	
	
	
	
	
	static class Studnet {
		int sno;
		String name;
		Studnet(int sno, String name){
			this.sno = sno;
			this.name = name;
		}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(sno,name);	//같은 매개변수가 들어온다면 서로 다른 객체라도 같은 해쉬코드 생성
	}
}
}