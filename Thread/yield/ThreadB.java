package Thread.yield;

public class ThreadB extends Thread {
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadB의 작업내용");
			}else {
				Thread.yield();
			}
		}
		System.out.println("ThreadB종료");
	}
	
}
