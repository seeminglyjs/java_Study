package Thread.yield;

public class ThreadA extends Thread {
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while(!stop) {
			//stop �� true �� �ɶ�����
			if(work) {
			//work�� Ʈ���	
				System.out.println("ThreadA�� �۾�����");
			}else {
				Thread.yield();
			}
		}
		System.out.println("ThreadA����");
	}
	
}
