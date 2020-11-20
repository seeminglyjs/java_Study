package Thread_wait_notify2;

public class ProducerThread extends Thread {
	private DataBox dataBox;
	
	public ProducerThread(DataBox dataBoxx) {
		this.setName("ProducerThread");
		this.dataBox = dataBox;
	}
	
	@Override
	public void run() {
		for(int i = 1 ; i <=3; i++) {
			String data = "Data-" + i;
			dataBox.setData(data);
		}
	}
}
