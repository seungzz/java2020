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
			System.exit(i);	//프로그램 종료 메소드로 System.exit()를 입력하면
							//프로그램이 종료됩니다.
	}catch(SecurityException e) {
		
	}
}
}
}