package Thread;

import java.awt.Toolkit;

public class main2 {

	public static void main(String[] args) {
		
		//��ӹ��� ������ ����� 1 ���� Ŭ������ ����� ����Ŭ������ ��ü ������ ����ϴ� ���
//		run2 thread = new run2();
//		thread.start();
		
		//��ӹ��� ������ ����� 2 �͸�ü�� ���
		Thread thread = new Thread() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
						}catch(Exception e) {
							
					}
				}
			}
		};
		thread.start();
		
		//�� ���ڿ��� ����ϴ� �ڵ�
		for(int i = 0; i < 5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
				}catch(Exception e) {
					
			}
		}
	}

}
