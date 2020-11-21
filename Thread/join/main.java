package Thread.join;

public class main {

	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		try {
			sumThread.join();
			//sumThread가 모두 끝날때까지 있다가
			//끝나면 실행
		} catch (InterruptedException e) {
			
		}
		
		System.out.println(sumThread.getSum());
		
	}

}
