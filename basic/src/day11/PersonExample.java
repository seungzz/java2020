package day11;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "����");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "usa";		final�� �Ǿ��ִ� �ʵ�� ������ ���� ������ �� ����.
		//p1.ssn = "123123123-12312313";	final�� �����ڸ� ���ؼ� ������ ���� ���� �� ���� �ʱ⿡ �� �ѹ�!
		p1.name = "����";
	}
}
