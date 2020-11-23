package Lambda.andThenCompose_predicate;

import java.util.function.IntPredicate;

public class main {

	public static void main(String[] args) {
		//2의 배수를 검사하는 메소드
		IntPredicate predicateA = a -> a%2 == 0;
		
		//3의 배슈
		IntPredicate predicateB = a -> a%3 == 0;
		
		IntPredicate predicateAB;
		
		boolean result;
		
		predicateAB = predicateA.and(predicateB);
		result = predicateAB.test(9); // false
		System.out.println(result);
	
	
		predicateAB = predicateA.or(predicateB);
		result = predicateAB.test(9); // true
		System.out.println(result);
		
		predicateAB = predicateA.negate(); // ! not 연산자와 같은 기능
		result = predicateAB.test(9); // true
		System.out.println(result);
		
	}

}
