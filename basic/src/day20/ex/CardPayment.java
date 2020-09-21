package day20.ex;

public class CardPayment extends Payment {
	private String cardNumber;
	private String cardPassword;
	private int monthlyInstallment;
	
	
	public CardPayment(String shopname, String productname, long productPrice, String cardNumber, String cardPassword, int monthlyInstallment) {
		super(shopname, productname, productPrice);
		// TODO Auto-generated constructor stub
		this.shopname = shopname;
		this.productname = productname;
		this.productPrice = productPrice;
		this.cardNumber = cardNumber;
		this.cardPassword = cardPassword;
		this.monthlyInstallment = monthlyInstallment;
	}
	@Override
	public String toString() {	
		
		return "신용카드가 정상적으로 지불되었습니다." +"\n"+
				"[ 신용카드 결제 정보 ]" + "\n"+
				"상점명 : " + shopname +"\n"+
				"상품명 : " + productname +"\n"+
				"상품가격 : " + productPrice + "\n"+
				"신용카드번호: " + cardNumber+"\n"+
				"할부개월: " + monthlyInstallment
				;
	
	}
	@Override
	public void pay() throws PayException {
		if(productPrice<0 | monthlyInstallment<0) {
			throw new PayException("가격이나 할부개월수가 잘못되었습니다.");
		}
		
	}
}
	
