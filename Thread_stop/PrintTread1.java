package Thread_stop;

public class PrintTread1 extends Thread{
	private boolean stop;

	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		while(!stop) {
			System.out.println("���� ��");	
		}
		System.out.println("�ڿ�����");
		System.out.println("���� ����");
	}
}
