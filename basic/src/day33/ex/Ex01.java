package day33.ex;

import java.util.function.IntConsumer;

//consumer �Լ� �������̽��� Ȱ���ؼ� �Ű������� int�� �޾� �� �ܾ� �ش��ϴ� ������ ���
public class Ex01 {	
	public static void main(String[] args) {
		IntConsumer intConsumer = i -> System.out.println(i);
		for(int i=1; i<10; i++) {
			System.out.println(i+"��");
			for(int j=1; j<10; j++) {
				System.out.print
				(i+"x"+j+"=");
				intConsumer.accept(i*j);
			}
			
		}
		
	}

}
