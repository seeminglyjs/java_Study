package Stream.NumberRange;

import java.util.stream.IntStream;

public class main {
	public static int sum;
	
	public static void main(String[] args) {
		IntStream stream = IntStream.range(1, 100);
		//intstream range는 첫번째 숫자부터 뒤에숫자까지 차례대로 제공한다.
		
		stream.forEachOrdered(a -> sum += a);
		//foreach문을 통해 값을 하나씩 a에 넣고 그 값을 sum에 누적시킨다.
		System.out.println(sum);
	}

}
