package day17;

public class VehicleExample2 {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare();
		
		Bus bus = (Bus)vehicle;
		//강제형변환
		bus.run();
		bus.checkFare();
	}
}
