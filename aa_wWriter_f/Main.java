package aa_wWriter_f;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Main {

	public static void main(String[] args) {
		
		//https://docs.oracle.com/javase/8/docs/api/
		
		Writer wr = new OutputStreamWriter(System.out); 
		//Writer는 추상클래스이기 때문에 단독으로 new 연산자로 객체를 선언할 수 없다.
		//자식클래스를 매개로 받아야지 객체생성이 가능하다.
		//문자열스트림을 출력하는 클래스이기 때문에, 스트림기반출력클래스 및 System.out을 형변환 해야한다.
		
		
//		String str = "Hello, Hi";	
//		try {
//			wr.write(str);
//			wr.flush();
//			//writer는 스트링 객체를 전달받아 바로 출력하는게 가능하다.	
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				wr.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
//		String str = "Hello, Hi";
//		char [] buf = str.toCharArray();
//		// 스트링을 쪼개어 문자배열에 담아준다
//		
//		try {
//			for(int i = 0; i < buf.length; i++) {
//				wr.write(buf[i]);
//				//writer는 문자배열의 객체를 하나씩 받아 출력	
//			}
//			wr.flush();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				wr.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//
//		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		
		String str = "Hello, Hi";
		char [] buf = str.toCharArray();
		// 스트링을 쪼개어 문자배열에 담아준다
		
		try {
			wr.write(buf,0, buf.length);
			//writer는 문자배열의 범위를 지정해 출력할 수도 있다.
			wr.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				wr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		
	}

}
