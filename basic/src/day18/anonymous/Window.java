package day18.anonymous;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	Button.OnClickListener listener = new Button.OnClickListener() {
		//onclicklistener는 구현객체가 없어서 오버라이드 해서 구현객체를 만든다.
		@Override
		public void onClick() {
			System.out.println("전활걸어~");
			
			
		}
	};
	Window() {
		button1.setOnClickListener(listener);
		button2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("메세지를 보내~");
				
			}
		});
	}

}
