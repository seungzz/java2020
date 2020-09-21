package day16;

public class SmartPhone extends Phone{

	public SmartPhone(String owner) {
		super(owner);	//super를 이용해야 에러나지 않고 만들 수 있다. 부모클래스 생성자 부름
		// TODO Auto-generated constructor stub
	}
	//메소드
	public void internerSearch() {
		System.out.println("인터넷검색");
	}
	

}
