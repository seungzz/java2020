package day30.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteExample {
	public static void main(String[] args) throws Exception{
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		for(int i=0; i<10; i++) {
			Runnable runnable = new Runnable() {
				
				@Override
				public void run() {
					ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
					int poolSize = threadPoolExecutor.getPoolSize();
					String threadName = Thread.currentThread().getName();
					System.out.println("[총 스레드 갯수: "+poolSize +"] 작업스리드 이름: "+threadName);
					
					int value = Integer.parseInt("삼");
					//예외 발생
				}
			};
			//executorService.execute(runnable); 	//작업처리요청
			executorService.submit(runnable);
			//execute와 submit의 차이점은 실행 후 예외가 일어나면 submit은 예외가 일어나도
			//스레드를 종료시키지 않고 재활용하는 반면에 execute는 예외가 일어나면 스레드를 종료한다. 
			
			Thread.sleep(10);
			
		}
		executorService.shutdown();     //스레드풀 종료
		//스레드 풀의 경우 main이 종료돼도 계속 실행 상태로 남아있기 때문에 main이 종료되기 전에 항상 종료시켜주어야한다.
		
		//executorService.shutdownnow() 은 남아있는 작업이 있어도 강제로 종료시키는 메소드.
	}
}
