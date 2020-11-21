package Thread.tsynchronized;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) {
		//synchronized ���� �ٸ� ��������� ���� �� �� ����
		//�������� ������� �߻��ϴ� ���� �����ش�.
		//�� �ٸ� �����尡 �������϶� ����� �߻��ϰԵǰ� �̷�����
		//�ش� �����尡 ����ɶ����� �ٸ�������� ������ �� ����.
		
		this.memory = memory;
		try {
			Thread.sleep(2000);
			//2�� ���� �Ͻ� ���� ��Ű�� ������ �޼ҵ�
			System.out.println(Thread.currentThread().getName() + ": " + this.memory);
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() + ": " + this.memory);
		}
	}
	
}
