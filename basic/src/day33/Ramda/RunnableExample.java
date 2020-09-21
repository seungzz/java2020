package day33.Ramda;

public class RunnableExample {
	public static void main(String[] args) {
		
	
	Runnable runnable = () -> {
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
	};
	
	Thread thread = new Thread(runnable);
	thread.start();
	

//	Thread thread = new Thread(() -> {
//		for(int i=0; i<10; i++) {
//			System.out.println(i);
//
//		}
//	});
//스레드에도 람다식을 통해서 활용할 수 잇다. 
	
  }
}