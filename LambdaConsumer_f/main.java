package LambdaConsumer_f;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class main {

	public static void main(String[] args) {
		
		Consumer<String> consumer = t ->{
			System.out.println(t +"이다.");
		};
		//매개값만 받고 리턴값은 없는 인터페이스
		consumer.accept("king");
		
		BiConsumer<String, Integer> bis = (a, b)->{
			System.out.println("이름은 " + a + "나이는 " + b);
		};
		bis.accept("king", 25);
		//두가자 제네릭 타입을 받는 인터페이스 마찬가지로 리턴값은 없다.
	}

}
