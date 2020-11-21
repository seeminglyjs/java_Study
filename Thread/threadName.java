package Thread;

import java.awt.Toolkit;

public class threadName {

	public static void main(String[] args) {
			Thread thread = Thread.currentThread();
			System.out.println(thread.getName());
			
			Thread threadA = new name();
			threadA.start();
			
			Thread threadB = new name2();
			threadB.start();
	}

}
