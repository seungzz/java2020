package day34.Collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		set.add(new Member("홍길동",30));
		set.add(new Member("홍길동",30));		
		
		System.out.println("총 객체수: "+set.size());		
		//Member에서 hashCode()를 오버라이딩 했기 때문에 서로 다른 객체 주소를 가지고 있어도
		//name의 주소가 같다면 같은 값으로 인식
		//오버라이딩 하지 않은경우(주석처리) ->주소가 다르기 때문에(new로 선언) 다른 객체로 인식한다.
		for(Member mem : set) {
			System.out.println(mem.name);
		}
	}
}
