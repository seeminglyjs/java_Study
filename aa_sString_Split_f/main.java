package aa_sString_Split_f;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		// split 메서드를 이용하면 문자열의 특정 기호에 따른
		// 문자열의 조합은 분리하여 정리할 수 있다..
		
		String str = "hi-hi,hi%hi,hi-hi,hi%hi";
		// 불필요한 특정 특수 기호가 들어가 있는 문자열 변수 선언.
		
		//하나의 변수에 쪼개진 String의 문자데이터를 각각 담을 수 없기 떄문에
		//String 배열을 하나 만들어준다.
		
		String [] arr = str.split("-|%|,"); 
		//각 문자열을 추출하여 배열에 담아준다.
		
		for(String s : arr) {
			System.out.print(s + " ");
		}
		//forEach문을 통해 전체배열을 순회하면서 출력을 해준다.
		
	}

}
