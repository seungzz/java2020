package day02;

public class CheckValueBeforeCasting {
	public static void main(String[] args) {
		int i =123;
		//Byte.�� �ϸ� �ִ�, �ּڰ��� �������� �� �� �ִ�. 
		if ((i>Byte.MAX_VALUE) || (i<Byte.MIN_VALUE)) {
			System.out.println("byte Ÿ������ ����Ұ�");
			System.out.println("���� �ٽ� Ȯ�����ּ���.");
			
		} else {
			byte b = (byte) i;
			System.out.println(b);
			
		}
	}

}
