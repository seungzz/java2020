package day18;

public class ButtonExample {
	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListener(new CallListener());
		btn.tough();
		
		
		btn.setOnClickListener(new MessageListener());
		btn.tough();
	}
	
	
	
}
