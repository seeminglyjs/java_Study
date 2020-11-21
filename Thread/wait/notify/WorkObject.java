package Thread.wait.notify;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("methodA 작업실행");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
		}
	}
	
	public synchronized void methodB() {
		System.out.println("methodB 작업실행");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
		}
	}
}
