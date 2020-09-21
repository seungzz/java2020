package day15;

public class KumhoTire extends Tire {
	
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location +"Kumhotire ¼ö¸í: "+(maxRotation-accumulatedRotation)+"È¸" );
		return true;
		}else {
			System.out.println("***"+location +"HankookTire ÆãÅ©***");
			return false;
		}
		
	}


}
