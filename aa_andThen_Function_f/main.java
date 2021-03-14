package aa_andThen_Function_f;

import java.util.function.Function;

public class main {

	public static void main(String[] args) {
		
		Function<People, Info> function1; //�Ű� People ���� Info
		Function<Info, Integer> function2; //�Ű� Info ���� Integer
		Function<People, Integer> function3; //�Ű� People ���� Integer



		function1 = (i) -> i.getInfo(); // info Ŭ������ �켱������ �����´�.
		function2 = (c) -> c.getCm(); // ���� info Ŭ������ Ű ������ cm�� ���� �´�.
//
//		function3 = function1.andThen(function2); 
//		// function1�� ���ٽ� ������
//		// function2�� ���ٽ��� ó���Ѵ�.
//		int height = function3.apply(
//				new People("abc", 25, new Info(200))		
//				);
//		System.out.println("andThen ó����� -> " + height);

		function3 = function2.compose(function1);
		// andThen�ϰ� ó�� ������ �ٸ���,
		// function1�� ���ٽ� ������
		// function2�� ���ٽ��� ó���Ѵ�.
		int height = function3.apply(
				new People("god", 30, new Info(100))
				);
		
		System.out.println("compose ó����� -> " + height);


	}

}
