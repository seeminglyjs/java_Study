package Thread_Group;

public class main {

	public static void main(String[] args) {
		ThreadGroup myGroup = new ThreadGroup("myGroup");
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
		
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("메인 스레드 그룹의 list() 메소드 출력____");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		mainGroup.list();  
		System.out.println();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		System.out.println("mygruop 의 interrupt 호출");
		myGroup.interrupt();
	}

}
