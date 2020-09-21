package day19;

public class CatchOrderExample {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[0];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1+"+"+data2+"="+result);
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("����");
		}catch(Exception e ) {	//exception�� ��� ���ܸ� ó���� �� �ִ� ���� �������ִ� �����̴�.
			System.out.println("���࿡ ���� �ִ�");
		}finally {
			System.out.println("�ٽý���");
		}
	}
}