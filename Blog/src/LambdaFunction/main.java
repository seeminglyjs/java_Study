package LambdaFunction;

import java.util.function.Function;

public class main {

	public static void main(String[] args) {
//	p694
	
		human hu = new human();
		hu.setName("king");
		hu.setAge(100);
		
		
		Function<human, String> hu1 = t ->{
			return t.getName();
		};
		System.out.println(hu1.apply(hu));
		
		
		Function<human, Integer> hu2 = t ->{
			return t.getAge();
		};
		System.out.println(hu2.apply(hu));
		
		
	}

}
