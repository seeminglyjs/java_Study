package Demon_Group_f;

public class main {

	public static void main(String[] args) {
		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();	
		
			thread1.setDaemon(true);
//			thread1.start();
//			thread2.start();

			System.out.println(thread1.currentThread().getThreadGroup());
			System.out.println(thread2.currentThread().getThreadGroup());
		

////////////////////////////////////////////////////////////////////////////		
	
//	ThreadGroup tg = new ThreadGroup("group1");
//	Thread3 thread3 = new Thread3(tg, "tg1");
//	Thread4 thread4 = new Thread4(tg, "tg2");
//	
//	thread3.setDaemon(true);
//	thread3.start();
//	thread4.start();
	
	}

}
