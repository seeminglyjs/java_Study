package Thread_stop;

public class Stopmain {

	public static void main(String[] args) {
//		PrintTread1 printThread = new PrintTread1();
//		printThread.start();
//		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			
//		}
//		printThread.setStop(true);
	
		
		Thread thread = new PrintThread2();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
	
		thread.interrupt();
		
	}

}
