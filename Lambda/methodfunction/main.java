package Lambda.methodfunction;

import java.util.function.ToIntBiFunction;

public class main {

	public static void main(String[] args) {
		ToIntBiFunction<String, String>function;
		
		function = (a,b) -> a.compareToIgnoreCase(b);
		print(function.applyAsInt("java8", "JAVA8"));
		
		function = String :: compareToIgnoreCase;
		print(function.applyAsInt("java8", "JAVA8"));
	}
	
	public static void print(int order) {
		if(order < 0) {
			System.out.println("a-");
		}else if(order == 0) {
			System.out.println("a==b");
		}else {
			System.out.println("a+");
		}
	}
}
