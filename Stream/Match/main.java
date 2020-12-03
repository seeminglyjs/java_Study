package Stream.Match;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		//match는 최종처리 메소드이다.
		
		int[] intArr = {2,4,6};
		
		boolean result = Arrays.stream(intArr).allMatch(a -> a%2 ==0);
		System.out.println(result);
		result = Arrays.stream(intArr).allMatch(a ->a%3 ==0);
		System.out.println(result);
		result = Arrays.stream(intArr).anyMatch(a ->a%3 ==0);
		System.out.println(result);
		result = Arrays.stream(intArr).noneMatch(a ->a%3 ==0);
		System.out.println(result);
		
	}

}
