package Thread.join;

public class main {

	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		try {
			sumThread.join();
			//sumThread�� ��� ���������� �ִٰ�
			//������ ����
		} catch (InterruptedException e) {
			
		}
		
		System.out.println(sumThread.getSum());
		
	}

}
