package day11;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5);  //Car의 setGas메소드 호출
		
		boolean gasState = myCar.isLeftGas(); 	//Car의 isLeftGas메소드 호출
		
		if(gasState) {
			System.out.println("출발");
			myCar.run();
			
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("가스필요없음");
		
			
		}
		
		else {
			System.out.println("가스주입!");
		}
	}

}
