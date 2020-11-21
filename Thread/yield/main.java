package Thread.yield;

public class main {

	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB= new ThreadB();
		
		threadA.start();
		threadB.start();
		
		try {
			Thread.sleep(3000);
			threadA.work = false;
		} catch (InterruptedException e) {
			threadA.work = false;
		}
	

		try {
			Thread.sleep(3000);
			threadA.work = true;
		} catch (InterruptedException e) {
			threadA.work = true;
		}
		
		try {
			Thread.sleep(3000);
			threadA.stop =true;
			threadB.stop =true;
		} catch (InterruptedException e) {
			threadA.stop =true;
			threadB.stop =true;
		}
		
		
	}
}