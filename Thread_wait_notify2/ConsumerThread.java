package Thread_wait_notify2;

public class ConsumerThread extends Thread{
	private DataBox dataBox;
	
	public ConsumerThread(DataBox dataBoxx) {
		this.setName("ConsumerThread");
		this.dataBox = dataBox;
	}
	
	@Override
	public void run() {
		for(int i = 1; i <=3; i++) {
			String data = dataBox.getData();
		}
	}
}
