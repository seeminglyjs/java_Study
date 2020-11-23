package Lambda.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class main {
	private static List<Student> list = Arrays.asList(
			new Student("ȫ�浿", "����", 90),
			new Student("ȫȫ��", "����", 92),
			new Student("���浿", "����", 99),
			new Student("���浿", "����", 99)
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
		//���� ��� ����
		
		double maleAvg = avg(t -> t.getSex().equals("����"));
		System.out.println(maleAvg);
	
		double feAvg = avg(t -> t.getSex().equals("����"));
		System.out.println(feAvg);
	}
	
}
