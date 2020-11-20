package Thread_Group;

public class WorkThread extends Thread {
	public WorkThread(ThreadGroup threadGroup, String threadName) {
		super(threadGroup, threadName);
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(getName() + "인터럽트 됬다");
				break;
			}
		}
		
		System.out.println(getName() + "종료됨");
	}
}
