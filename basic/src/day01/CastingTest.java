package day01;

public class CastingTest {
	 public static void main(String[] args) {
		 int i = 127;
		 byte b = 100;
		 
		 int i2 = b;
		 byte c =(byte)i;
		// byte c = i;
		 //��������ȯ casting�̶�� �Ѵ�. ������ȯ �Ҷ��� �׻� �������� ���� ��밪���� ū�� ������ Ȯ���� �־�� �Ѵ�.
		 //�ڵ���������ȯ �Ǵ°��� ������ �Ǵ� ��ĳ�����̶�� �Ѵ�.
		 
		 System.out.println(c);
	 }

}
