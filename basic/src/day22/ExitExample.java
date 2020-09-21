package day22;

public class ExitExample {
	public static void main(String[] args) {
		System.setSecurityManager(new SecurityManager() {
		@Override
		public void checkExit(int status) {
			if(status !=5 ) {
				throw new SecurityException();
			}
		}
	});
	for(int i= 0; i<10; i++) {
		System.out.println(i);
		try {
			System.exit(i);	//���α׷� ���� �޼ҵ�� System.exit()�� �Է��ϸ�
							//���α׷��� ����˴ϴ�.
	}catch(SecurityException e) {
		
	}
}
}
}