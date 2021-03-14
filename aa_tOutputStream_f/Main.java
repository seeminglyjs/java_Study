package aa_tOutputStream_f;

import java.io.IOException;
import java.io.OutputStream;

public class Main {

	public static void main(String[] args) {
		OutputStream os = System.out;
//		public abstract class OutputStream
//		extends Object
//		implements Closeable, Flushable
//		자바 API 상에도 나와 있듯이 추상 클래스
//		이기 때문에 자체적으로 new 연산자를 사용할 수 없다.
//		new 연산자의 사용을 원할 경우 자식클래스를 받으면 된다.
		
		byte[] checkByte = new byte [10];
		
		checkByte[0] = 'K';
		checkByte[1] = 'I';
		checkByte[2] = 'N';
		checkByte[3] = 'G';
		checkByte[4] = '!';
		// 입력된 "KING!" 를 writer를 사용해 콘솔해 출력해 보겠다.
		
		System.out.println("------------------------------------------------");
		System.out.println("== 버퍼에 저장되어 있던 데이터가 출력됩니다. == ");
		try {
			os.write(checkByte);
			// write를 이용해 입력된 데이터를 출력
			os.flush();
			// 버퍼에 잔류하는 모든 데이터를 출력하는 메소드
			// write 사용시 반드시 사용해야 한다.
			// 버퍼를 비우지 않으면 차후 출력문 실행시
			// 원하지 않는 데이터와 함께 출력될 수 있기 때문이다.
			os.close();
			// 출력이 완료되었기 때문에 OutputStream을 닫아준다.
			// 이로써 자원을 풀어주는 기능을 하게 된다.
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}