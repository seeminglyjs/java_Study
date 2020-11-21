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
		
		System.out.println("작업처리요청");
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
			//블로킹이 된다. 스레드 풀에서 runnable을 실행 완료하게 되면,
			//리턴이 된다.
			System.out.println("작업처리완료");
		} catch (InterruptedException e) {
			System.out.println("예외발생 I");
		} catch (ExecutionException e) {
		}
		
		executorService.shutdown();
		
	}

}
