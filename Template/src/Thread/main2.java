package Thread;

import java.awt.Toolkit;

public class main2 {

	public static void main(String[] args) {
		
		//상속받은 스레드 사용방법 1 직접 클래스를 만들어 메인클래스에 객체 생성후 사용하는 방법
//		run2 thread = new run2();
//		thread.start();
		
		//상속받은 스레드 사용방법 2 익명객체로 사용
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
