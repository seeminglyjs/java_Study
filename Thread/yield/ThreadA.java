package Thread.yield;

public class ThreadA extends Thread {
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while(!stop) {
			//stop 가 true 갈 될때까지
			if(work) {
			//work가 트루면	
				System.out.println("ThreadA의 작업내용");
			}else {
				Thread.yield();
			}
		}
		System.out.println("ThreadA종료");
	}
	
}
