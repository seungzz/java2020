package day33.Ramda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;
//제네릭을 받아서 활용
public class ConsumerExample {
	public static void main(String[] args) {
		Consumer<String> consumer = t -> System.out.println(t+"8");
		consumer.accept("java");
		
		BiConsumer<String, String> bigConsumer = (t,u)-> System.out.println(t+u);
		//매개변수가 두개로 이루어진 표준 형식의 인터페이스
		
		
		bigConsumer.accept("java", "8");
		//제네릭 두개를 받아서accept()로 실행시킨다
		
		
		//double은 제네릭을 쓰지 않는다. double갖고 람다식을 만들어서 사용해~!
		DoubleConsumer doubleConsumer = d -> System.out.println("java"+d);
		doubleConsumer.accept(8.0);
		
		
		//오브젝트와 인트로 매개변수를 갖는다. 제네릭은 t,뒤에있는 변수는 int
		ObjIntConsumer<String> objintConsumer = (t,i) -> System.out.println(t+i);
		objintConsumer.accept("java", 8);
	}
}
