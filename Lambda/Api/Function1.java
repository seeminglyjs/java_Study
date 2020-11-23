package Lambda.Api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class Function1 {
	private static List<_Student> list =Arrays.asList(
			new _Student("홍길동", 90, 96),
			new _Student("신용권", 95, 93)
			);

	public static void printString( Function<_Student, String> function) {
		for(_Student student : list) {
			//학생 객체가 두개라 두번 돌개 된다.
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
		System.out.println("[학생 이름]");
		printString(t -> t.getName());
		//매개변수가 하나라 () 생략 되었고 리턴값만 있는 메소드라 return도 생략되었다.
		//학생같은 매개변수로 받으면, getName으로 호출하겠다라는 의미
		System.out.println("[영어 점수]");
		printInt(t -> t.getenglish());
		
		
		System.out.println("[수학 점수]");
		printInt(t -> t.getmath());
	
	}
	
	
}
