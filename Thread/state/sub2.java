package Thread.state;

public class sub2 extends Thread {
	private Thread sub;
	public sub2(Thread sub) {
		this.sub = sub;
	}
	
	@Override
	public void run() {
		while(true) {
			Thread.State state = sub.getState();
			System.out.println("타겟 스레드 상태: " + state);
			if(state == Thread.State.NEW) {
				sub.start();
			}
			
			if(state == Thread.State.TERMINATED) {
				break;
			}
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
		
		
		
		
		
		
	
}
