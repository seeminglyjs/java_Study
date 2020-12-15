package LambdaSupplier_f;

import java.util.Scanner;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public class main {

	public static void main(String[] args) {
		
		Supplier<String> supplier = () ->{
			String result = "king";
			return result;
		};
		System.out.println(supplier.get());
		//Consumer와는 반대로 매개값은 없지만 리턴값은 있다.
		
		
		Scanner scan = new Scanner(System.in);
		BooleanSupplier bs = () ->{
			int a = scan.nextInt();
			if(a > 0) {
				return true;
			}else {
				return false;
			}
		};
		//입력 받는 값이 양수인지 음수인지 체크하는 간단한 supplier 람다식
		System.out.println(bs.getAsBoolean());

	}

}
