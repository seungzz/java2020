package day19;

public class TryCatchFinallyRuntimeExceptionExample {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		try {
			data1 = args[0];
			data2 = args[1];
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족");
			System.out.println("[실행방법]");
			System.out.println("java TryCatchFinallyRuntimeExceptionExample"+"num1+num2");
			return;	//리턴문을 사용하면 사용하던 메소드에서 빠져나오게 된다.
					//대신 finally문은 실행된다.
		}
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1+"+"+data2+"+"+result);
		
		}catch(NumberFormatException e) {
			System.out.println("숫자로 변환불가");
		}finally {
			System.out.println("다시실행");
		}
	}
}
