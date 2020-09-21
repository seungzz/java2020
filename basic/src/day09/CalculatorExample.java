package day09;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1:" +result1 );
		
		byte x = 10;		//바이트로 넣어도 인트로 자동변화되어서 저장이 된다
		byte y = 4;			//만약에 double이었다면 자기가 갖고있던 데이터를 잃게 되기 때문에 에러난다
		double result2 = myCalc.divide(x, y);
		System.out.println("result2:" +result2);
		myCalc.powerOff();
		
		
	}
}
