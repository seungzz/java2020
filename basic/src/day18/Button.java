package day18;

public class Button {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void tough() {
		listener.onClick();	
	}
	
	//중첩인터페이스
	interface OnClickListener {
		void onClick();
	}
}
