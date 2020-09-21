package day20.ex;

public class CashPayment extends Payment{
	private String cashReceiptNumber;
	
	
	public CashPayment(String shopname, String productname, long productPrice, String cashReceiptNumber) {
		super(shopname, productname, productPrice);
		// TODO Auto-generated constructor stub
		this.cashReceiptNumber = cashReceiptNumber;
		this.shopname = shopname;
		this.productname = productname;
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {	//toStrong()�� �������̵��ؼ� ���ϴ� ���ڸ� ����� �� �մ�.
		
		return "������ ���������� ���ҵǾ����ϴ�." +"\n"+
				"[ ���� ���� ���� ]" + "\n"+
				"������ : " + shopname +"\n"+
				"��ǰ�� : " + productname +"\n"+
				"��ǰ���� : " + productPrice + "\n"+
				"���ݿ���������: " + cashReceiptNumber
				;
	}
	@Override
	public void pay() throws PayException {
		if(productPrice <=0) {
			throw new PayException("������ �߸��Ǿ����ϴ�.");
		}
		
		
	}
}
