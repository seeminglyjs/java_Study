package Demon_Group_f;

public class Thread3 extends Thread {
	public Thread3(ThreadGroup tg, String name) {
		super(tg, name);
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				System.out.println("Thread3 is Running . . .");
				Thread.sleep(1000);
			}
		}catch (Exception e) {
			
		}	
	}
}
