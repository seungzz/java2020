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
		
		return "�ſ�ī�尡 ���������� ���ҵǾ����ϴ�." +"\n"+
				"[ �ſ�ī�� ���� ���� ]" + "\n"+
				"������ : " + shopname +"\n"+
				"��ǰ�� : " + productname +"\n"+
				"��ǰ���� : " + productPrice + "\n"+
				"�ſ�ī���ȣ: " + cardNumber+"\n"+
				"�Һΰ���: " + monthlyInstallment
				;
	
	}
	@Override
	public void pay() throws PayException {
		if(productPrice<0 | monthlyInstallment<0) {
			throw new PayException("�����̳� �Һΰ������� �߸��Ǿ����ϴ�.");
		}
		
	}
}
	
