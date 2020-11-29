package Stream.Array;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class main {
	public static void main(String[] args) {
	String [] arr = {"aaa","bbb","ccc"};
	Stream<String> stream = Arrays.stream(arr);
	stream.forEach(a ->System.out.println(a+ " "));
	
	int [] arr1 = {1, 2, 3, 4};
	IntStream stream1 = Arrays.stream(arr1);
	
	stream1.forEach(a -> System.out.println(a + " "));
	
	}
}