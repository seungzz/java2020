package day33.ex;

import java.util.function.IntConsumer;

//consumer 함수 인터페이스를 활용해서 매개변수를 int로 받아 그 단어 해당하는 구구단 출력
public class Ex01 {	
	public static void main(String[] args) {
		IntConsumer intConsumer = i -> System.out.println(i);
		for(int i=1; i<10; i++) {
			System.out.println(i+"단");
			for(int j=1; j<10; j++) {
				System.out.print
				(i+"x"+j+"=");
				intConsumer.accept(i*j);
			}
			
		}
		
	}

}
