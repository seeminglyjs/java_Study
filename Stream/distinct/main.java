package Stream.distinct;

import java.util.Arrays;
import java.util.List;

public class main {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("aaa", "bbb", "ccc", "bbb", "ddd", "fff", "bgg");
		
		list.stream()
		.distinct()
		.forEach(n -> System.out.print(n+ " "));
		System.out.println();
		//중복된 값 제거하고 출력
		
		
		list.stream()
		.filter(n -> n.startsWith("b"))
		.forEach(n ->System.out.print(n + " "));
		System.out.println();
		//앞자리가 b인 이름만 출력
		
		list.stream()
		.distinct()
		.filter(n->n.startsWith("b"))
		.forEach(n-> System.out.print(n + " "));
		//중복된 값 제거후 앞자리가 b인 것만 출력
		
	}

}
