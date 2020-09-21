package day30.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultExample {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		//�̿��� �� �ִ� �ִ�ġ�� �����带 ���ϴ� �޼ҵ�
		
		
		System.out.println("[�۾� ó�� ��û]");
		Runnable runnable = new Runnable()	 {
			
			@Override
			public void run() {
				int sum =0;
				for(int i=1; i<10;i++) {sum +=i;}
					System.out.println("[ó�����]" +sum);
				}
			};
			Future future = executorService.submit(runnable);
			//�����Ϸᰴü. �����ż� �Ϸ�ɶ����� ��ٸ��� �Ϸ�Ǹ� �˷���
			
			try {
				future.get();
				System.out.println("[�۾� ó�� �Ϸ�]");
				
		}catch(Exception e) {
			System.out.println("[���� ���� �߻���]"+e.getMessage());
		}
			executorService.shutdown();
	}
}
