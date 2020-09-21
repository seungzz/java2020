package day02;

public class CheckValueBeforeCasting {
	public static void main(String[] args) {
		int i =123;
		//Byte.을 하면 최댓값, 최솟값이 무엇인지 알 수 있다. 
		if ((i>Byte.MAX_VALUE) || (i<Byte.MIN_VALUE)) {
			System.out.println("byte 타입으로 변경불가");
			System.out.println("값을 다시 확인해주세요.");
			
		} else {
			byte b = (byte) i;
			System.out.println(b);
			
		}
	}

}
