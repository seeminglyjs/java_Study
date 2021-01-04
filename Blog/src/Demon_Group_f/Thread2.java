package Demon_Group_f;

public class Thread2 extends Thread {
	
	@Override
	public void run() {
		for(int i = 0; i < 3; i++){
			System.out.println("Thread2 is Running . . .");
		}
	}
}
