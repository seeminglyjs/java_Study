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
		//Consumer�ʹ� �ݴ�� �Ű����� ������ ���ϰ��� �ִ�.
		
		
		Scanner scan = new Scanner(System.in);
		BooleanSupplier bs = () ->{
			int a = scan.nextInt();
			if(a > 0) {
				return true;
			}else {
				return false;
			}
		};
		//�Է� �޴� ���� ������� �������� üũ�ϴ� ������ supplier ���ٽ�
		System.out.println(bs.getAsBoolean());

	}

}
