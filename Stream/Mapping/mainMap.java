package Stream.Mapping;

import java.util.Arrays;
import java.util.List;

public class mainMap {

	public static void main(String[] args) {
		
		List<student> studentList = Arrays.asList(
				new student("홍길동", 10),
				new student("신용권", 20),
				new student("222", 30)
				
				);

		
		studentList.stream()
		.mapToInt(s -> s.getScore())
		.forEach(score ->System.out.println(score));
	}

}
