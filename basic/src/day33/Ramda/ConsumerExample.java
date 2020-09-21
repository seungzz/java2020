package day33.Ramda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;
//���׸��� �޾Ƽ� Ȱ��
public class ConsumerExample {
	public static void main(String[] args) {
		Consumer<String> consumer = t -> System.out.println(t+"8");
		consumer.accept("java");
		
		BiConsumer<String, String> bigConsumer = (t,u)-> System.out.println(t+u);
		//�Ű������� �ΰ��� �̷���� ǥ�� ������ �������̽�
		
		
		bigConsumer.accept("java", "8");
		//���׸� �ΰ��� �޾Ƽ�accept()�� �����Ų��
		
		
		//double�� ���׸��� ���� �ʴ´�. double���� ���ٽ��� ���� �����~!
		DoubleConsumer doubleConsumer = d -> System.out.println("java"+d);
		doubleConsumer.accept(8.0);
		
		
		//������Ʈ�� ��Ʈ�� �Ű������� ���´�. ���׸��� t,�ڿ��ִ� ������ int
		ObjIntConsumer<String> objintConsumer = (t,i) -> System.out.println(t+i);
		objintConsumer.accept("java", 8);
	}
}
