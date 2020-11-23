package Lambda.andThenCompose_Function;

import java.util.function.Function;

public class main {

	public static void main(String[] args) {
		Function<Member, Address> functionA;
		Function<Address, String> functionB;
		Function<Member, String> functionAB;
	
	
		functionA = (m) -> m.getAddress();
		functionB = (a) -> a.getCity();
		
		functionAB= functionA.andThen(functionB);
		String city = functionAB.apply(new Member("god", "hong", new Address("korea", "seoul")));
		System.out.println(city);
	
		functionAB= functionB.compose(functionA);
		String city1 = functionAB.apply(new Member("god", "hong", new Address("korea", "seoul")));
		System.out.println(city1);
	
	}
	
	 	
	

}
