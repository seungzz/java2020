package day12;

public class ShopServiceExample {
	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1==obj2) {
			System.out.println("���� shopservice��ü");
			
		}else {
			System.out.println("�ٸ� shopservice��ü");
		}
	}
}
