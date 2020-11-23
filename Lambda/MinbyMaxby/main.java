package Lambda.MinbyMaxby;

import java.util.function.BinaryOperator;

public class main {

	public static void main(String[] args) {
		BinaryOperator<Fruit> binaryOperator;
		
		Fruit fruit;
		
		binaryOperator = BinaryOperator.minBy((f1, f2) ->Integer.compare(f1.price, f2.price));
		//f1�� ������ ���� ������ 0 f2�� ũ�� ū��
		fruit = binaryOperator.apply(new Fruit("berry", 6000), new Fruit("apple", 9000));
		System.out.println(fruit.name);
		
		
		binaryOperator = BinaryOperator.maxBy((f1, f2) ->Integer.compare(f1.price, f2.price));
		fruit = binaryOperator.apply(new Fruit("berry", 6000), new Fruit("apple", 9000));
		System.out.println(fruit.name);
	}

}
