package day30.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultExample {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		//이용할 수 있는 최대치의 스레드를 구하는 메소드
		
		
		System.out.println("[작업 처리 요청]");
		Runnable runnable = new Runnable()	 {
			
			@Override
			public void run() {
				int sum =0;
				for(int i=1; i<10;i++) {sum +=i;}
					System.out.println("[처리결과]" +sum);
				}
			};
			Future future = executorService.submit(runnable);
			//지연완료객체. 지연돼서 완료될때까지 기다리고 완료되면 알려줌
			
			try {
				future.get();
				System.out.println("[작업 처리 완료]");
				
		}catch(Exception e) {
			System.out.println("[실행 예외 발생함]"+e.getMessage());
		}
			executorService.shutdown();
	}
}
