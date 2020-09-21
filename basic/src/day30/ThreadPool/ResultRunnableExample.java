package day30.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultRunnableExample {
	public static void main(String[] args) {
		ExecutorService executorService = 
				Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		System.out.println("[작업처리요청]");
		class Task implements Runnable{
			Result result;
			Task(Result result) {
				this.result = result;		//생성자에 Result객체를 사용하기 위해 Result객체를 주입받음
			}
			@Override
			public void run() {
				int sum = 0;
				for(int i=0; i<=10; i++) {
					sum +=i;
				}
				result.addValue(sum);	//Result 객체에 작업 결과 저장
			}
		}
		Result result = new Result();
		Runnable task1 = new Task(result);
		Runnable task2 = new Task(result);
		Future<Result> future1 = executorService.submit(task1, result);
		Future<Result> future2 = executorService.submit(task2, result);
		//연산을 두번 실행하기 때문에 처리 결과는 55*2인 110이 된다. 
		
		
		try {
			result = future1.get();	//두가지 작업 결과 취함
			result = future2.get();
			System.out.println("[처리결과] "+result.accumValue);
			System.out.println("[작업처리완료]");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("[실행예외발생]"+e.getMessage());
		}
		executorService.shutdown();
	}
}
class Result {
	int accumValue;
	synchronized void addValue(int value) {
		accumValue += value;
		
	}
}