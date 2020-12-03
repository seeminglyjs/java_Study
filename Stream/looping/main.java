package Stream.looping;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		int [] intArr = {1,2,3,4,5};
		
		
		Arrays.stream(intArr)
		.filter(a -> a%2 == 0)
		.peek(n -> System.out.println(n))
		//피크는 중간처리 메소드이기 때문에 따로 최종처리 메소드를 호출해주야 실행이 된다.
		.sum();
		
		//단순 foreach문을 사용하면 더 간단한 코드가 된다.
		Arrays.stream(intArr)
		.filter(a -> a%2 == 0)
		.forEach(n -> System.out.println(n));
	}

}
