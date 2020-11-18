package Thread;

import java.awt.Toolkit;

public class run2 extends Thread{
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
				}catch(Exception e) {
					
			}
		}
	}
}
