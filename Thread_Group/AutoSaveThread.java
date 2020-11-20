package Thread_Group;

public class AutoSaveThread extends Thread{
	public void save() {
		System.out.println("작업내용을 저장");
	}
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				break;
			}
			save();
		}

	}
}
