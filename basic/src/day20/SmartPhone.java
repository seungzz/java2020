package day20;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	@Override
	public String toString() {	//toStrong()을 오버라이드해서 원하는 문자를 출력할 수 잇다.
		
		return company +"," +os;
	}
}
