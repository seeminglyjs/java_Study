package Stream.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class main {

	public static void main(String[] args) {
		IntStream intStream = Arrays.stream(new int[] {5, 3, 2, 1, 4});	
		
		intStream
		.sorted()
		.forEach(n -> System.out.println(n));

		
		List<student> studentList = Arrays.asList(
				new student("홍길동", 30),
				new student("신용권", 20),
				new student("222", 10)
				);
		
		studentList.stream()
			.sorted()
			.forEach(s -> System.out.println(s.getScore()));
		
		studentList.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(s -> System.out.println(s.getScore()));
	
	}
}
