package LambdaFunction_f;

import java.util.function.Function;
import java.util.function.ToIntFunction;

public class main {

	public static void main(String[] args) {
		
		human hu = new human();
		hu.setName("king");
		hu.setAge(100);
		
		
//		Function<human, String> hu1 = t ->{
//			return t.getName();
//		};
//		System.out.println(hu1.apply(hu));
//		
//		
//		Function<human, Integer> hu2 = t ->{
//			return t.getAge();
//		};
//		System.out.println(hu2.apply(hu));
		
		ToIntFunction<human> hu3 = t ->{
			return t.getAge();
		};
		System.out.println(hu3.applyAsInt(hu));
		
		
	}

}
