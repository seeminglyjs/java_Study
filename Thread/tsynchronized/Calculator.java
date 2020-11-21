package Thread.tsynchronized;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) {
		//synchronized 사용시 다른 스레드들은 접근 할 수 없어
		//데이터의 모순성이 발생하는 것을 막아준다.
		//즉 다른 스레드가 실행중일때 잠금이 발생하게되고 이로인해
		//해당 스레드가 종료될때까지 다른스레드는 접근할 수 없다.
		
		this.memory = memory;
		try {
			Thread.sleep(2000);
			//2초 동안 일시 정지 시키는 스레드 메소드
			System.out.println(Thread.currentThread().getName() + ": " + this.memory);
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() + ": " + this.memory);
		}
	}
	
}
