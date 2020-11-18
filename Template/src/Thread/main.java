package Thread;

import java.awt.Toolkit;

public class main {

	public static void main(String[] args) {
		
		//스레드 구현 1번째 방법
//		Runnable beepTask = new run1();
//		Thread thread = new Thread(beepTask);
//		thread.start();
		 
		
		
		//스레드 구현 2번째 방법 다른클래스 만들지 않고 바로 구현하는 방법이다.
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
		
		
		//스레드 구현 3번째 방법 람다식을 활용한 코드 구현방법
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
		
		//띵 문자열을 출력하는 코드
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
				}catch(Exception e) {
					
			}
		}
	}

}
