package Generic1_f;

public class man2{
	public static <T extends Number> int compareAge(T age1, T age2) {
		int one = age1.intValue();
		int two = age2.intValue();	
		int big = one >= two ? one : two;	
		return big;
		
	}
	
}
