package Lambda.andThenCompose_predicate;

import java.util.function.Predicate;

public class main2isEqual {

	public static void main(String[] args) {
		Predicate<String> predicate;
		
		predicate = Predicate.isEqual(null);
		System.out.println("null, null: " + predicate.test(null));//true
		
		predicate = Predicate.isEqual("java8");
		System.out.println(predicate.test(null));//false
		
		
		predicate = Predicate.isEqual("java8");
		System.out.println(predicate.test("java8"));//true
	}

}
