package Stream.collect;

import java.util.Arrays;
import java.util.List;

public class mainMale {

	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("aaa", 10, Student.Sex.male),
				new Student("bbb", 6, Student.Sex.female),
				new Student("ccc", 12, Student.Sex.male),
				new Student("ddd", 5, Student.Sex.female)
				);
		
		
		MaleStudent maleStudent = totalList.stream()
		.filter(s -> s.getSex() == Student.Sex.male)
		.collect(
				()-> new MaleStudent(),
				//사용자 정의 컨테이너 람다식으로 구현
				(r, t) -> r.accumulate(t),
				// t는 필터의 한 요소이다.
				(r1, r2) -> r1.combine(r2));
				
		maleStudent.getList().stream()
		.forEach(s->System.out.println(s.getName()));
	
		
	}

}
