package Demon_Group_f;

public class Thread1 extends Thread {
	private boolean flag = true;
	
	@Override
	public void run() {
		while(flag) {
			System.out.println("Thread1 is Running . . .");
		}
	}
}
