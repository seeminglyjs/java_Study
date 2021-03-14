package aa_andThen_Function_f;

import java.util.function.Function;

public class main {

	public static void main(String[] args) {
		
		Function<People, Info> function1; //매개 People 리턴 Info
		Function<Info, Integer> function2; //매개 Info 리턴 Integer
		Function<People, Integer> function3; //매개 People 리턴 Integer



		function1 = (i) -> i.getInfo(); // info 클래스를 우선적으로 가져온다.
		function2 = (c) -> c.getCm(); // 이후 info 클래스의 키 정보인 cm을 가져 온다.
//
//		function3 = function1.andThen(function2); 
//		// function1의 람다식 실행후
//		// function2의 람다식을 처리한다.
//		int height = function3.apply(
//				new People("abc", 25, new Info(200))		
//				);
//		System.out.println("andThen 처리결과 -> " + height);

		function3 = function2.compose(function1);
		// andThen하고 처리 순서만 다르다,
		// function1의 람다식 실행후
		// function2의 람다식을 처리한다.
		int height = function3.apply(
				new People("god", 30, new Info(100))
				);
		
		System.out.println("compose 처리결과 -> " + height);


	}

}
