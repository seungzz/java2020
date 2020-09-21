package day20.ex;

public abstract class Payment implements Payable {
	String shopname;
	String productname;
    long productPrice;
	
	
	public Payment(String shopname, String productname, long productPrice) {
		this.shopname = shopname;
		this.productname = productname;
		this.productPrice = productPrice;
	}

	
	
	
	
}
