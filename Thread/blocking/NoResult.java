package Thread.blocking;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResult {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors()
		);
		
		System.out.println("�۾�ó����û");
		Runnable runnable= new Runnable() {
			@Override
			public void run() {
				int sum = 0;
				for(int i = 1; i <=10; i++) {
					sum += i;
				}
				System.out.println(sum);
			}
		};
		
		Future future = executorService.submit(runnable);
		try {
			future.get();
			//���ŷ�� �ȴ�. ������ Ǯ���� runnable�� ���� �Ϸ��ϰ� �Ǹ�,
			//������ �ȴ�.
			System.out.println("�۾�ó���Ϸ�");
		} catch (InterruptedException e) {
			System.out.println("���ܹ߻� I");
		} catch (ExecutionException e) {
		}
		
		executorService.shutdown();
		
	}

}
