package day11;

public class Calculator2Example {
	public static void main(String[] args) {
		Calculator2 myCalcu = new Calculator2();
		
		
		double result1 = myCalcu.areaRectangle(10);
		
		double result2 = myCalcu.areaRectangle(10,20);
		
		System.out.println("Á¤:" +result1);
		System.out.println("Á÷:" +result2);
	}
}
