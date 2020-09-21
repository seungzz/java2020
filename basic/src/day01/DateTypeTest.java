package day01;

public class DateTypeTest {
	public static void main(String[] args) {
		byte b = 1;
		short s = 1;
		int i =1;
		long l =1l, l2 =1l;
		
		float f = 1.1f,f1 = 1.1F; //float에 소수를 넣기 위해서는 f,F뒤에 붙여주어야한다
		double d = 1.1, d1 = 1.1d; //정확도를 위한 계산은 double
		
	    char c = 'a', c1 = 'a', c3 = 65;
	    boolean bool = true, bool2 = false;
	    
	    System.out.println(c);
	    System.out.println(c3);
	    System.out.println(c1);
	    System.out.println(bool);
	    System.out.println(bool2);
	    
	}

}
