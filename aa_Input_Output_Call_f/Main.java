package aa_Input_Output_Call_f;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {

	public static void main(String[] args) {
		
		InputStream is = System.in;
		OutputStream os = System.out;
	
		byte [] checkByte = new byte [100];
		int size = -1;
		// 입력된 데이터가 더이상 있는지 여부를 체크할
		// size 변수 -1일 경우 더 이상의 데이터가 없다. 
		
		System.out.println("데이터를 입력해주세요 ->  ");
		try {
			while((size = is.read(checkByte)) != -1) {
				System.out.println("\n== 입력된 데이터는 아래와 같습니다.==");
				os.write(checkByte, 0, size);
				// String 객체를 만들 필요 없이 바로 출력해주면 된다.
				// 단 현재 입력된 문자열의 길이만큼만 출력해야
				// 원하는 결과를 얻을 수 있다.
				os.flush();
				// 담아 있는 버퍼를 비워준다.
				// 비워주지 않을시 배열에 남아있는 공백문자가 남아있게된다.
				
				System.out.println("\n[ctrl + z] 누르면 InputStream는 종료됩니다. ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				is.close();
				os.close();
				// 자원이 사용이 끝나면 닫아줌으로써
				// 풀어준다.
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	}

}
