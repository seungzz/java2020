package day18.anonymous;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	Button.OnClickListener listener = new Button.OnClickListener() {
		//onclicklistener�� ������ü�� ��� �������̵� �ؼ� ������ü�� �����.
		@Override
		public void onClick() {
			System.out.println("��Ȱ�ɾ�~");
			
			
		}
	};
	Window() {
		button1.setOnClickListener(listener);
		button2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("�޼����� ����~");
				
			}
		});
	}

}
