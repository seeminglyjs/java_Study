package Stream.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class mainGroupReduction {

	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("aaa", 10, Student.Sex.male),
				new Student("bbb", 6, Student.Sex.female),
				new Student("ccc", 12, Student.Sex.male),
				new Student("ddd", 5, Student.Sex.female)
				);
		
		Map<Student.Sex, Double>mapBySex = totalList.stream()
				.collect(Collectors.groupingBy(
							Student :: getSex,
							Collectors.averagingDouble(Student :: getScore)
							));
		System.out.println(mapBySex.get(Student.Sex.male));
		System.out.println(mapBySex.get(Student.Sex.female));
	
	
	
	
		Map<Student.Sex, String>mapByName = totalList.stream()
				.collect(Collectors.groupingBy(
						Student :: getSex,
						Collectors.mapping(
								Student::getName,
								Collectors.joining(",")
								)
						));
	
	
	
		System.out.println(mapByName.get(Student.Sex.male));
		System.out.println(mapByName.get(Student.Sex.female));
	
	
	
	}

}
