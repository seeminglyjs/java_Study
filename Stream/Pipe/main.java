package Stream.Pipe;

import java.util.Arrays;
import java.util.List;

public class main {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("aaa", Member.male, 30),
				new Member("bbb", Member.female, 10),
				new Member("ccc", Member.male, 20),
				new Member("ddd", Member.female, 40)	
				);
		
		double MAvg = list.stream()
				.filter(m -> m.getSex() == Member.male)
				.mapToInt(Member :: getAge)
				.average()
				.getAsDouble();

		System.out.println(MAvg);
		
		double FAvg = list.stream()
				.filter(f -> f.getSex() == Member.female)
				.mapToInt(Member :: getAge)
				.average()
				.getAsDouble();
		
		System.out.println(FAvg);
		
	}

}
