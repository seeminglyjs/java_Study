package Stream.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class mainlooping {

	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("aaa", 10, Student.Sex.male, Student.City.Seoul),
				new Student("bbb", 6, Student.Sex.female, Student.City.Pusan),
				new Student("ccc", 12, Student.Sex.male, Student.City.Seoul),
				new Student("ddd", 5, Student.Sex.female, Student.City.Pusan)
				);

		Map<Student.Sex, List<Student>> mapBySex = totalList.stream()
				.collect(Collectors.groupingBy(Student ::getSex));
		
		System.out.println("___MaleStudent___");
		mapBySex.get(Student.Sex.male)
		.stream()
		.forEach(s -> System.out.println(s.getName()));
		
		System.out.println("___FemaleStudent___");
		mapBySex.get(Student.Sex.female)
		.stream()
		.forEach(s -> System.out.println(s.getName()));
		
		
		Map<Student.City, List<String>> mapByCity = totalList.stream()
				.collect(
						Collectors.groupingBy(
								Student::getCity,
								Collectors.mapping(Student :: getName, Collectors.toList())
								)
						);
		System.out.println("___CitySeoul___");		
		mapByCity.get(Student.City.Seoul).stream()
		.forEach(name -> System.out.println(name));
		
		System.out.println("___CityPusan___");		
		mapByCity.get(Student.City.Pusan).stream()
		.forEach(name -> System.out.println(name));
		
		
	}

}
