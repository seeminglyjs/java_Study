package Stream.collect;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class main {

	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("aaa", 10, Student.Sex.male),
				new Student("bbb", 6, Student.Sex.female),
				new Student("ccc", 12, Student.Sex.male),
				new Student("ddd", 5, Student.Sex.female)
				);
		
		
		List<Student> maleList = totalList.stream()
		.filter(s -> s.getSex() == Student.Sex.male)
		.collect(Collectors.toList());
		
		maleList.stream()
		.forEach(s->System.out.println(s.getName()));
		
		System.out.println();
	
		Set<Student> femaleList = totalList.stream()
				.filter(s -> s.getSex() == Student.Sex.female)
				.collect(Collectors.toCollection(HashSet::new));
		femaleList.stream()
		.forEach(s->System.out.println(s.getName()));
	
	}

}
