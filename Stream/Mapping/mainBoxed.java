package Stream.Mapping;

import java.util.Arrays;
import java.util.stream.IntStream;

public class mainBoxed {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		
		IntStream intS  =Arrays.stream(arr);
		
		intS.asDoubleStream().forEach(d ->System.out.println(d));
		
		System.out.println();
		
		intS = Arrays.stream(arr);
		intS.boxed().forEach(obj ->System.out.println(obj.intValue()));
	}

}
