package LambdaOperator_f;

import java.util.function.IntBinaryOperator;

public class main {

	private static int[] scores = {60, 70, 80};
	
	public static int check (IntBinaryOperator operator) {
		int result = scores[0];
		//결과값에 점수의 초기값을 넣어준다.
		for(int score : scores) {
			result = operator.applyAsInt(result, score);
			//result와 score를 int형 연산을 한 결과를  result에 다시 넣는 코드
			//아직 구현되지 않아 람다식으로 구현을 해주어야 한다.
		}
		return result;
	}
//////////////////////////////////////////////////////////////////////	
	public static void main(String[] args) {
		
		int max = check(
				(a,b) ->{
					return a > b ? a : b;
				}
				);

		
		int min = check(
				(a,b) ->{
					return a < b ? a : b;
				}
				);
		
		System.out.println(max + " " + min);
		
	}

}
