package Lambda.methodrefer;

import java.util.function.IntBinaryOperator;

public class main {

	public static void main(String[] args) {
		
		IntBinaryOperator operator;
		
		
		//���� �޼ҵ� ����
		operator =(x,y) ->Calculator.sMethod(x, y);
		System.out.println(operator.applyAsInt(1, 2));
		operator = Calculator:: sMethod;
		System.out.println(operator.applyAsInt(4, 5));
		
		
		//�ν��Ͻ� �޼ҵ� ����
		Calculator ca = new Calculator();
		operator = (x,y) -> ca.iMethod(x, y);
		System.out.println(operator.applyAsInt(1, 2));
		operator = ca :: iMethod;
		System.out.println(operator.applyAsInt(4, 6));
		
	}

}
