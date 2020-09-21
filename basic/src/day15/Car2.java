package day15;

public class Car2 {
	
	Tire frontLeftTire = new Tire("¾Õ¿Þ", 6);
	Tire frontRightTire = new Tire("¾Õ¿ì",2);
	Tire backLeftTire = new Tire("µÚ¿Þ",3);
	Tire backRightTire = new Tire("µÚ¿À",4);
	
	int run() {
		System.out.println("´Þ¸°´Ù.");
		if(frontLeftTire.roll()==false) {stop(); return 1;}
		if(frontRightTire.roll()==false) {stop(); return 2;}
		if(backLeftTire.roll()==false) {stop(); return 3;}
		if(backRightTire.roll()==false) {stop(); return 4;}
		
		return 0;
	}
		void stop() {
	System.out.println("¸ØÃã");
}
	}

