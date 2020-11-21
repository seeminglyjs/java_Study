package Thread.excute.submit;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExcuteVsSubmitExample {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		//�ھ� �����带 2���� ����
		
		for(int i = 0; i < 10; i++) {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor)executorService;
				int poolSize = threadPoolExecutor.getPoolSize();
				//������ ���� ���� �� �� �ִ�.	
				String threadName = Thread.currentThread().getName();
				//���� �������� �������� �̸��� ���´�.
				System.out.println("[�� ������ ����: "+ poolSize +"] �۾�ó�� - " + threadName);
				int value = Integer.parseInt("��");
				//���� �ڵ�� ���� �� �߻�
				//execute�� �����Ͽ��� ������ ����  �߻� ������ ���� ��
				//���ο� �����带 ����� ��
			}
		};
		//10���� runnable �۾��� ó���Ѵ�.
		
		//executorService.execute(runnable);
		executorService.submit(runnable);
		//submit�� ���ܹ߻��� �����带 �������� �ʰ�
		//������ �����Ѵ�. ���ܸ޼����� ��µ��� �ʴ´�. 
		}
		
		executorService.shutdown();
	}

}
