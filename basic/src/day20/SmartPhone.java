package day20;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	@Override
	public String toString() {	//toStrong()�� �������̵��ؼ� ���ϴ� ���ڸ� ����� �� �մ�.
		
		return company +"," +os;
	}
}
