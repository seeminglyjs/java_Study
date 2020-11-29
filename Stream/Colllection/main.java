package Stream.Colllection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class main {

	public static void main(String[] args) {
		
		List<Student>list = Arrays.asList(	
				new Student("aaa", 20),
				new Student("bbb", 25),
				new Student("ccc", 30)
				);
		
		Stream<Student> stream = list.stream();
		
		stream.forEach(s -> System.out.println(s.getName()));
				

	}

}
