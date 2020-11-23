package Lambda.Api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class Function1 {
	private static List<_Student> list =Arrays.asList(
			new _Student("ȫ�浿", 90, 96),
			new _Student("�ſ��", 95, 93)
			);

	public static void printString( Function<_Student, String> function) {
		for(_Student student : list) {
			//�л� ��ü�� �ΰ��� �ι� ���� �ȴ�.
			System.out.print(function.apply(student) + " ");
		}
		System.out.println();
	}
	
	public static void printInt( ToIntFunction<_Student> function) {
		for(_Student student : list) {
			System.out.print(function.applyAsInt(student) + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("[�л� �̸�]");
		printString(t -> t.getName());
		//�Ű������� �ϳ��� () ���� �Ǿ��� ���ϰ��� �ִ� �޼ҵ�� return�� �����Ǿ���.
		//�л����� �Ű������� ������, getName���� ȣ���ϰڴٶ�� �ǹ�
		System.out.println("[���� ����]");
		printInt(t -> t.getenglish());
		
		
		System.out.println("[���� ����]");
		printInt(t -> t.getmath());
	
	}
	
	
}
