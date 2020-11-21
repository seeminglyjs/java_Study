package Thread;

public class name2 extends Thread {
	public name2() {
		setName("ThreadB");
	}
	
	
	@Override
	public void run() {
		for(int i = 0; i < 2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}
}
