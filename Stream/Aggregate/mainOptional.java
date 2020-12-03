package Stream.Aggregate;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class mainOptional {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		 
		/*
		 * double avg =list.stream() .mapToInt(Integer :: intValue) .average()
		 * .getAsDouble();
		 */
		
		OptionalDouble optional = list.stream()
				.mapToInt(Integer ::intValue)
				.average();
		if(optional.isPresent()) {
			System.out.println(optional.getAsDouble());
		}else {
			 System.out.println(0.0);
			 //��Ұ� ���� 0.0�� �����
		}
				
		double avg =list.stream()
			.mapToInt(Integer ::intValue)
			.average()
			.orElse(0.0);
		System.out.println(avg);
		
		
		list.add(2);
		list.add(3);
		list.stream()
				.mapToInt(Integer ::intValue)
				.average()
				.ifPresent(a -> System.out.println(a));
		
			
	}

}
