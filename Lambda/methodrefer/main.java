package Lambda.methodrefer;

import java.util.function.IntBinaryOperator;

public class main {

	public static void main(String[] args) {
		
		IntBinaryOperator operator;
		
		
		//정적 메소드 참조
		operator =(x,y) ->Calculator.sMethod(x, y);
		System.out.println(operator.applyAsInt(1, 2));
		operator = Calculator:: sMethod;
		System.out.println(operator.applyAsInt(4, 5));
		
		
		//인스턴스 메소드 참조
		Calculator ca = new Calculator();
		operator = (x,y) -> ca.iMethod(x, y);
		System.out.println(operator.applyAsInt(1, 2));
		operator = ca :: iMethod;
		System.out.println(operator.applyAsInt(4, 6));
		
	}

}
