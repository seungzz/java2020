package day12;


public class ShopService {

	public static ShopService s = new ShopService();
	
	 ShopService() {
		
	}
	
	static ShopService getInstance() {
		return s;
	}
}
