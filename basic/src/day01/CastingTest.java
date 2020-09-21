package day01;

public class CastingTest {
	 public static void main(String[] args) {
		 int i = 127;
		 byte b = 100;
		 
		 int i2 = b;
		 byte c =(byte)i;
		// byte c = i;
		 //강제형변환 casting이라고 한다. 강제변환 할때는 항상 넣으려는 값이 상대값보다 큰지 작은지 확인해 주어야 한다.
		 //자동으로형변환 되는것을 묵시적 또는 업캐스팅이라고 한다.
		 
		 System.out.println(c);
	 }

}
