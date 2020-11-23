package Lambda.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class main {
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", "남자", 90),
			new Student("홍홍동", "여자", 92),
			new Student("갑길동", "여자", 99),
			new Student("을길동", "남자", 99)
			);
	
	public static double avg(Predicate<Student> predicate) {
		int count = 0;
		int sum = 0;
		for(Student student : list) {
			if(predicate.test(student)) {
				count++;
				sum += student.getScore();
			}
		}
		
		return (double) sum/count;
		
	}
	
	public static void main(String[] args) {
		//남자 평균 점수
		
		double maleAvg = avg(t -> t.getSex().equals("남자"));
		System.out.println(maleAvg);
	
		double feAvg = avg(t -> t.getSex().equals("여자"));
		System.out.println(feAvg);
	}
	
}
