package Stream.Mapping;

import java.util.Arrays;
import java.util.List;

public class main {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("java8 lambda", "stream mapping");
		
		list.stream()
		.flatMap(data ->Arrays.stream(data.split(" ")))
		.forEach(word -> System.out.println(word));
		
		System.out.println();
		
		List<String> list2 = Arrays.asList("10,20,30","40,50,60");
		list2.stream()
		.flatMapToInt(data -> {
			String [] arr = data.split(",");
			int[] intArr = new int[arr.length];
			for(int i =0; i< arr.length; i++) {
				intArr[i] = Integer.parseInt(arr[i].trim());
			}
			return Arrays.stream(intArr);
		})
		.forEach(number ->System.out.println(number));
	}

}
