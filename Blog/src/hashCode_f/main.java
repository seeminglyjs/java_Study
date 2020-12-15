package hashCode_f;

import java.util.HashMap;

public class main {

	public static void main(String[] args) {
		HashMap<thashCode, String> test = new HashMap<thashCode, String>();
		//키값은 thashCord고 매개값은 String인 test hashmap 생성
		
		test.put(new thashCode("1"), "테스트");
		
		String value = test.get(new thashCode("1"));
		//키값 1에 위치한 테스트를 불러오는  value 변수 선언
		System.out.println(value);
		//하지만 출력결과 null 값을 출력함

	}

}
