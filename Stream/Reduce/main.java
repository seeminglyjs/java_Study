package Stream.Reduce;

import java.util.Arrays;
import java.util.List;

import Stream.Mapping.student;

public class main {

	public static void main(String[] args) {
		List<student> studentList = Arrays.asList(
				new student("홍길동", 90),
				new student("신용권", 80),
				new student("222", 90)
				
				);

		int sum1 = studentList.stream()
				.mapToInt(student::getScore)
				.sum();
		
		int sum2 = studentList.stream()
				.mapToInt(student::getScore)
				.reduce((a,b) -> a+b)
				.getAsInt();
		
		int sum3= studentList.stream()
				.mapToInt(student::getScore)
				.reduce(0,(a,b) -> a+b );
	
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
	}

}
