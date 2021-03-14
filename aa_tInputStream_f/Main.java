package aa_tInputStream_f;

import java.io.IOException;
import java.io.InputStream;

public class Main {

	public static void main(String[] args) {
		
		InputStream is = System.in;
		// InputStream API 상에서 추상 클래스 이기 때문에
		// new 연산자를 사용하려면 자식클래스를 받아야 한다.
//		public abstract class InputStream
//		extends Object
//		implements Closeable
//		
		
		byte [] arr = new byte [100];
		// 콘솔된 입력된 데이터를 100개의 바이트까지
		// 읽을 수 있는 배열을 생성한다.
		// loop의 반복 횟수를 줄여서 속도를 높여준다.
		// 자신의 컴퓨터 환경에 맞게 알맞은 배열크기를
		// 설정하는 것이 중요하다.
		
		
		int checkByte = -1;
		// 계속 입력받는 데이터가 있는지 확인할 변수
		System.out.println("데이터를 입력해주세요 ->    ");
		try {
			while((checkByte = is.read(arr)) != -1) {
				// read 메서드는 더이상 읽을 데이터가 없을 경우
				// -1을 리턴하게 된다. 
				// 때문에 -1을 리턴하기 전까지 반복하면 된다.
				String temp = new String(arr, 0, checkByte);
				System.out.println("read로 받은 데이터는 - > " + temp);
				// 이후 String의 새로운 객체로 배열과 배열의 시작위치
				// 현재 입력받은 데이터의 길이를 매개 값으로 주어 출력을 해보자.
				
				System.out.println("[ctrl + z] 누르면 InputStream는 종료됩니다. ");
				// ctrl + z 는 입력 콘솔창을 종료시키는 단축키다.
				// 설정에 따라 조금 다를 수 있다.
			}
		} catch (IOException e) {
		
			e.printStackTrace();
		}finally {
			try {
				System.out.println("\n자원을 닫습니다.");
				is.close();
				// 자원을 모두 사용한 후
				// 자원을 이제 풀어주기 위해 
				// close를 호출해준다.
				System.out.println("\n====프로그램 종료 완료====");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	
	
	}
	

}