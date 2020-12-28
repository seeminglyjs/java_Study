package LambdaOperator_f;

import java.util.function.IntBinaryOperator;

public class main {

	private static int[] scores = {60, 70, 80};
	
	public static int check (IntBinaryOperator operator) {
		int result = scores[0];
		//������� ������ �ʱⰪ�� �־��ش�.
		for(int score : scores) {
			result = operator.applyAsInt(result, score);
			//result�� score�� int�� ������ �� �����  result�� �ٽ� �ִ� �ڵ�
			//���� �������� �ʾ� ���ٽ����� ������ ���־�� �Ѵ�.
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
