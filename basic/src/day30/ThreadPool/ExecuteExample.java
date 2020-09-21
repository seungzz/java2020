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
					System.out.println("[�� ������ ����: "+poolSize +"] �۾������� �̸�: "+threadName);
					
					int value = Integer.parseInt("��");
					//���� �߻�
				}
			};
			//executorService.execute(runnable); 	//�۾�ó����û
			executorService.submit(runnable);
			//execute�� submit�� �������� ���� �� ���ܰ� �Ͼ�� submit�� ���ܰ� �Ͼ��
			//�����带 �����Ű�� �ʰ� ��Ȱ���ϴ� �ݸ鿡 execute�� ���ܰ� �Ͼ�� �����带 �����Ѵ�. 
			
			Thread.sleep(10);
			
		}
		executorService.shutdown();     //������Ǯ ����
		//������ Ǯ�� ��� main�� ����ŵ� ��� ���� ���·� �����ֱ� ������ main�� ����Ǳ� ���� �׻� ��������־���Ѵ�.
		
		//executorService.shutdownnow() �� �����ִ� �۾��� �־ ������ �����Ű�� �޼ҵ�.
	}
}
