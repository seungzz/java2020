package day18.anonymous;

public class Button {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void tough() {
		listener.onClick();	
	}
	
	//��ø�������̽�
	interface OnClickListener {
		void onClick();
	}
}
