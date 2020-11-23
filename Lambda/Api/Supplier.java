package Lambda.Api;

import java.util.function.IntSupplier;

public class Supplier {

	public static void main(String[] args) {
		IntSupplier intSupplier = () ->{
			int num = (int)(Math.random() * 6) + 1;
			return num;
		};

		int num = intSupplier.getAsInt();
		System.out.println(num);
	}

}
