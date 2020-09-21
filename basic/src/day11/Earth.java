package day11;

public class Earth {
		static final double EARTH_RADIOUS =6400;
		static final double EARTH_SURFACE_AREA;
		
		static {
			EARTH_SURFACE_AREA = 4*Math.PI * EARTH_RADIOUS * EARTH_RADIOUS;
		//처음에 static final을 선언했지만 따로 계산이 필요하다고 생각되어서 따로 선언해줌
			
		
		}
}
