package aa_wWrapper_f;

import java.util.Date;

public class main {

	public static void main(String[] args) {
		
		//자바의 기본 타입은
		// byte, short char, int, long, float, double, boolean
		// 이러한 타입으로 만들어진 객체를 Wrapper 객체라고 한다.
		// -> 기본타입의 값을 내부에 두고 포장하기 때문에 지어진 이름이다.
		//포장 클래스의 타입은 주로 기본타입에서 앞글자만 대문자로 바뀌는데,
		// 예외는 char - Character / int -> Integer는 예외이다.
		
		// 기본타입을 포장타입으로 바꾸는 것을 박싱이라고 하는데,
		// 방법은 간단한다.
		
		//****박싱방법
//		Integer num1 = 10; // 자동 박싱
//		Integer num2 = new Integer(100); 
//		Integer num3 = Integer.valueOf(1000); 
//		System.out.println(num1.getClass());
//		System.out.println(num2.getClass());
//		System.out.println(num3.getClass());
		
		// 직접 값을 대입하는 방식으로도 가능하며,
		// new 를 사용하는 방법 Integer.valueOf를 사용하는 방법이있다.
//		
//		
		//****언박싱방법		
//		int numA = num1; // 자동 언박싱
//		int numB = num2.intValue();
//		System.out.println(numA);
//		System.out.println(numB);
		
		// 직접 int에 wrapper객체를 넣어주는 방법
		// intValue를 이용해 직접 포장을 풀어주는 방법이 있다.
		
		
		//****문자열을 기본 타입으로 변환
		
		//Wrapper 클래스를 이용하는 주된 이유인 문자열을 기본 타입으로 바꾸는 방법이다.
		
//		int intSt = Integer.parseInt("100");
//		double doubleSt = Double.parseDouble("100.10");
//		long longSt = Long.parseLong("10000000000");
//		boolean booleanSt = Boolean.parseBoolean("false");
//		
//		System.out.println(intSt);
//		System.out.println(doubleSt);
//		System.out.println(longSt);
//		System.out.println(booleanSt);
//		
//		
//		
//		//****Wrapper 클래스는 == != 를 통한 값의 비교가 되지 않는다.
//		
		Integer numA = 200;
		Integer numB = 200;
		
		System.out.println(numA == numB);
		System.out.println(numA.equals(numB));
		
		// 값의 범위가 -128 ~ 127의 범위에 있을 경우 == != 로 비교가 가능하지만
		// 해당 범위를 넘어가면 equals로 비교를 해주어야 한다.

		}
	
	}
