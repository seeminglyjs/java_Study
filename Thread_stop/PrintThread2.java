package Thread_stop;

public class PrintThread2 extends Thread {
	
	@Override
	public void run() {

////////��� 1		
//		try {
//			while(true) {
//				System.out.println("���� ��");	
//				Thread.sleep(1);	 
//			}
//		}catch (InterruptedException e) {
//			
//		}
//		System.out.println("����Ǿ���.");
////////�ٸ���� 2		
		while(true) {
		System.out.println("���� ��");	
		if(Thread.interrupted()) {
			break;
		}
	}
		System.out.println("����Ǿ���.");
	}
}
