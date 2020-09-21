package day30.ThreadPool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultbyCallableExample {
	public static void main(String[] args) {
		ExecutorService executorService = 
				Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		System.out.println("[작업 처리 요청]");
		Callable<Integer> task = new Callable<Integer>() {
			//<>:제네릭     Callable<>은 runnalbe()과 거의 비슷하게 사용된다.
			//Callable이라는 것이 있는데<integer>타입으로 반환하겠다.
			
			
			@Override
			public Integer call() throws Exception {
				int sum = 0;
				for(int i=0;i<=10;i++) {
					sum +=i;
				}
				return sum;
			}
		};
		
		Future<Integer> future = executorService.submit(task);
		try {
			int sum = future.get();		//처리결과를 sum으로 받는다.
			System.out.println("[처리결과]"+sum);
			System.out.println("[작업처리완료]");
		}catch(Exception e) {
			System.out.println("[실행예외발생함]"+e.getMessage());
		}
		executorService.shutdown();
	}
}
