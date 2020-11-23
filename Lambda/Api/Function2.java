package Lambda.Api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class Function2 {
	private static List<_Student> list =Arrays.asList(
			new _Student("홍길동", 90, 96),
			new _Student("신용권", 95, 93)
			);

	
	public static double avg( ToIntFunction<_Student> function) {
		int sum = 0;
		for(_Student student : list) {
			sum+= function.applyAsInt(student);
		}
		double avg =(double) sum / list.size();
		return avg;
	}
	
	public static void main(String[] args) {
		double englishAvg = avg(t -> t.getenglish());
		System.out.println("영어 평균 점수: " + englishAvg);
		double MathAvg = avg(t -> t.getmath());
		System.out.println("수학 평균 점수: " + MathAvg);
	}
	
	
}
