package day09;

public class KoreanExample {
	public static void main(String[] args) {
		Korean k1 = new Korean("���ڹ�", "102983102938");
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		
		Korean k2 = new Korean("���ڹ�", "930191-12093");
		System.out.println(k2.name);
		System.out.println(k2.ssn);
	}
}
