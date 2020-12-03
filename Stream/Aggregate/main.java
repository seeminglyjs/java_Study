package Stream.Aggregate;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		long count = Arrays.stream(new int[] {1,2,3,4,5})
			.filter(n->n%2==0)
			.count();
			System.out.println(count);
			
		int sum = Arrays.stream(new int[] {1,2,3,4,5})
			.filter(n->n%2==0)
			.sum();
			System.out.println(sum);
	
		int max =Arrays.stream(new int[] {1,2,3,4,5})
			.filter(n->n%2==0)	
			.max()
			.getAsInt();
		System.out.println(max);
		
		
		int min =Arrays.stream(new int[] {1,2,3,4,5})
				.filter(n->n%2==0)	
				.min()
				.getAsInt();
			System.out.println(min);
			
		int three = Arrays.stream(new int[] {1,2,3,4,5})
			.filter(n->n%3==0)	
			.findFirst() 
			.getAsInt();
		System.out.println(three);
	
	
	}		

}
