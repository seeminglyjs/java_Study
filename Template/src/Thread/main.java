package Thread;

import java.awt.Toolkit;

public class main {

	public static void main(String[] args) {
		
		//������ ���� 1��° ���
//		Runnable beepTask = new run1();
//		Thread thread = new Thread(beepTask);
//		thread.start();
		 
		
		
		//������ ���� 2��° ��� �ٸ�Ŭ���� ������ �ʰ� �ٷ� �����ϴ� ����̴�.
//		Thread thread = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				for(int i = 0; i < 5; i++) {
//					toolkit.beep();
//					try {
//						Thread.sleep(500);
//						}catch(Exception e) {
//							
//					}
//				}
//			}
//		});
//		thread.start();
		
		
		//������ ���� 3��° ��� ���ٽ��� Ȱ���� �ڵ� �������
		Thread thread = new Thread(()-> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i = 0; i < 5; i++) {
				toolkit.beep();
				try {
					Thread.sleep(500);
					}catch(Exception e) {
						
				}
			}
		});
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
