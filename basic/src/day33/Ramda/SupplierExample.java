package day33.Ramda;

import java.util.function.IntSupplier;
import java.util.function.Supplier;
//Supplier엔 매개변수가 없다.
public class SupplierExample {
	public static void main(String[] args) {
		IntSupplier intSupplier = () -> {
			int num = (int)(Math.random()*6) +1;
			
			
			return num;
		};
		int num = intSupplier.getAsInt();
		System.out.println("눈의 수 : "+num);
	
		Supplier<String> supplier = () -> {
			return "String";
		};
		
		
	}
}
