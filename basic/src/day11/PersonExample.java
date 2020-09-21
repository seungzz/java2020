package day11;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "승지");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "usa";		final로 되어있는 필드는 수정을 위해 접근할 수 없다.
		//p1.ssn = "123123123-12312313";	final은 생성자를 통해서 무조건 값을 넣을 수 있음 초기에 딱 한번!
		p1.name = "은주";
	}
}
