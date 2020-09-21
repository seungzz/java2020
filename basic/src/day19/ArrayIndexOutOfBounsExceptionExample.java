package day19;

public class ArrayIndexOutOfBounsExceptionExample {
	public static void main(String[] args) {
		//args는 실행할때 들어오는 어떤 값들(arguments)
		String data1 = args[0];
		String data2 = args[1];
		//args는 값을 정해주지 않았기 때문에 비어있다. 0번 인덱스도 존재하지 않는다.
		
		
		System.out.println("args[0] :" +data1);
		System.out.println("args[1] :" +data2);
	}
}
