package Lambda.Api;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;



public class Comsumer {

	public static void main(String[] args) {
		Consumer<String> consumer = t -> System.out.println(t + "8");
		consumer.accept("java");
	
	
		BiConsumer<String, String> bigConsumer = (t,u) -> System.out.println("BI: "+ t + u);
		bigConsumer.accept("java", "8");
		
		DoubleConsumer doubleConsumer = d -> System.out.println("Dou: "+"Java" + d);
		doubleConsumer.accept(8); //int 값 넣어도 자동 형변환이 된다.
		
		ObjIntConsumer<String> objIntConsumer = (t, i) -> System.out.println("ObjInt: "+ t + i);
		objIntConsumer.accept("java", 8);
	}

}
