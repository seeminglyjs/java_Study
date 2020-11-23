package Lambda.andThenCompose_predicate;

import java.util.function.IntPredicate;

public class main {

	public static void main(String[] args) {
		//2�� ����� �˻��ϴ� �޼ҵ�
		IntPredicate predicateA = a -> a%2 == 0;
		
		//3�� �轴
		IntPredicate predicateB = a -> a%3 == 0;
		
		IntPredicate predicateAB;
		
		boolean result;
		
		predicateAB = predicateA.and(predicateB);
		result = predicateAB.test(9); // false
		System.out.println(result);
	
	
		predicateAB = predicateA.or(predicateB);
		result = predicateAB.test(9); // true
		System.out.println(result);
		
		predicateAB = predicateA.negate(); // ! not �����ڿ� ���� ���
		result = predicateAB.test(9); // true
		System.out.println(result);
		
	}

}
