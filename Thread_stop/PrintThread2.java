package Thread_stop;

public class PrintThread2 extends Thread {
	
	@Override
	public void run() {

////////방법 1		
//		try {
//			while(true) {
//				System.out.println("실행 중");	
//				Thread.sleep(1);	 
//			}
//		}catch (InterruptedException e) {
//			
//		}
//		System.out.println("종료되었다.");
////////다른방법 2		
		while(true) {
		System.out.println("실행 중");	
		if(Thread.interrupted()) {
			break;
		}
	}
		System.out.println("종료되었다.");
	}
}
