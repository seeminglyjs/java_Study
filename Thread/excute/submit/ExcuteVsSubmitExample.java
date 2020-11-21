package Thread.excute.submit;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExcuteVsSubmitExample {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		//코어 쓰레드를 2개로 설정
		
		for(int i = 0; i < 10; i++) {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor)executorService;
				int poolSize = threadPoolExecutor.getPoolSize();
				//쓰레드 수를 얻을 수 가 있다.	
				String threadName = Thread.currentThread().getName();
				//현재 진행중인 쓰레드의 이름을 얻어온다.
				System.out.println("[총 스레드 개수: "+ poolSize +"] 작업처리 - " + threadName);
				int value = Integer.parseInt("삼");
				//위의 코드로 예외 가 발생
				//execute로 실행하였기 때문에 예외  발생 스레드 제거 후
				//새로운 스레드를 만들게 됨
			}
		};
		//10개의 runnable 작업을 처리한다.
		
		//executorService.execute(runnable);
		executorService.submit(runnable);
		//submit은 예외발생시 스레드를 제거하지 않고
		//재사용을 진행한다. 예외메세지가 출력되지 않는다. 
		}
		
		executorService.shutdown();
	}

}
