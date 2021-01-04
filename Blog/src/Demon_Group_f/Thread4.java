package Demon_Group_f;

public class Thread4 extends Thread {
	public Thread4(ThreadGroup tg, String name) {
		super(tg, name);
	}
	
	@Override
	public void run() {	
		try {
			for(int i = 0; i < 5; i++) {
				System.out.println("Thread4 is Running . . .");
				Thread.sleep(1000);
			}
			System.out.println("같은 그룹 모든 스레드 종료");
		}catch (Exception e) {
			
		}	
	}
}
