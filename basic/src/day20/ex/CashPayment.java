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
	public String toString() {	//toStrong()을 오버라이드해서 원하는 문자를 출력할 수 잇다.
		
		return "현금이 정상적으로 지불되었습니다." +"\n"+
				"[ 현금 결제 정보 ]" + "\n"+
				"상점명 : " + shopname +"\n"+
				"상품명 : " + productname +"\n"+
				"상품가격 : " + productPrice + "\n"+
				"현금영수증가격: " + cashReceiptNumber
				;
	}
	@Override
	public void pay() throws PayException {
		if(productPrice <=0) {
			throw new PayException("가격이 잘못되었습니다.");
		}
		
		
	}
}
