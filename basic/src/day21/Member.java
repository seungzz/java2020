package day21;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
		
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {		//같은형식의 객체인지 먼저 확인한다. 
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
}
