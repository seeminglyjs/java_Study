package Stream.parallel;

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
		
		
		MaleStudent maleStudent = totalList.parallelStream()
		.filter(s -> s.getSex() == Student.Sex.male)
		.collect(
				()-> new MaleStudent(),
				//����� ���� �����̳� ���ٽ����� ����
				(r, t) -> r.accumulate(t),
				// t�� ������ �� ����̴�.
				(r1, r2) -> r1.combine(r2));
				
		maleStudent.getList().stream()
		.forEach(s->System.out.println(s.getName()));
	
		
	}

}
