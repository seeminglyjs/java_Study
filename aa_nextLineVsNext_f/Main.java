package aa_nextLineVsNext_f;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// Scanner 을 사용하다 보면 String 변수를 콘솔에 입력받는
		// 경우가 상당히 많다. 보통 Scanner 에서 제공하는
		// nextLine / next 이 두가지 메서드를 사용해서 입력을 받을 것이다.
		// 오늘은 이 두 메서드의 차이를 알아보자.
		
//		String str1 = scan.next();
//		// 우선 next의 경우 공백문자를 받아들일 수가 없다.
//		// 위와 같이 입력 "a a"와 같은 결과를 주었다고 보자.
//		System.out.println("str1 -> " + str1);
		
		// 출렬결과를 확인해보면
		// " a" 공백과 a는 없고, 처음에 a만 저장되어 
		// 출력되는 것을 확인할 수 있다.
		// 즉 Scanner의 next는 토큰의 개념으로
		// 문자열을 입력받는데, 해당 토큰에서 공백문자는
		// 구분자로 인식해 앞에있는 a만 저장되는 것이다.
		// 즉 쉽게 말하면
		// Enter 키는 물론 Space 키도 구분자로 인식한다는 것이다.
		
		
//		
//		String str2 = scan.nextLine();
//		// 그래서 바로 nextLine 메소드가 필요하다는 것이다.
//		// 메소드 이름에서도 느껴지듯이 공백문자와 상관없이
//		// 콘솔창 한줄(Line)에 있으면 모두 인식해 String 변수로
//		// 리턴한다는 것이다.
//		// 마찬가지로 "a a"를 입력값으로 넣어주어 보겠다.
//		System.out.println("str2 -> " + str2);
//		// 출력결과 공백문자가 포함된 문자열을 입력값으로 
//		// 주었음에도 불구하고 모두 저장하여 출력되는 것을 확인할 수 있다.
		
		
		// 그러면 여기서 궁금증이 생길 수가 있다. 그러면
		// next 말고 nextLine 만쓰면 되는거 아니야?? 라고 말이다.
		// 자 메소드가 두개면 그에 따른 이유가 있다.
		// 아래 예제를 보자.
		// 이번에는 연속해서 next와 nextLine 메소드를 사용해보자
		// 매개변수는 마찬가지로 "a a" 를 줄 것이다.
		
		
//		String str1 = scan.next();
//		System.out.println("str1 -> " + str1);
//		String str2 = scan.nextLine();
//		System.out.println("str2 -> " + str2);
//		
//		// 출력결과
//		//a a
//		//a
//		// a
		
		
		
		// 그럼 위와 같은 요상한 결과가 나오게 된다. 
		// 이는 next()로 받고 남은 " a" 가 
		// scan.nextLine으로 넘어가기 때문이다.
		// 쉽게 말하면 " a" 라는 버려진 문자열은 지금
		// 버퍼에 남겨져 있는 상태인데 이와같은 버퍼를
		// 처리하지 않고 다시 입력을 받을라고 하니,
		// 버퍼측에서는 우선순위가 높은 기존에 문자열을
		// 던져버리는 것이다.
		// 때문에 nextLine() 전에 nextXXX 와 같은 메소드를
		// 사용했다면 반드시 버퍼를 비워주어야한다.
		
//		String str1 = scan.next();
//		System.out.println("str1 -> " + str1);
//		scan.nextLine();
//		String str2 = scan.nextLine();
//		System.out.println("str2 -> " + str2);
		
		// 위와 같이 nextLine으로 변수에 담기전에
		// nextLine 메소드만 호출해 버퍼를 비워주면
		// 문제없이 다음 입력을 받을 수 있다.
		// 물론 애초부터 String으로 모두 nextLine으로 받은뒤
		// 각 변수형 Wrapper클래스에 담아 다시 원하는 형태로
		// 형변환을 해주면 이와같은 버퍼문제는 생각하지 않아도 된다.
		// 아래는 그 예이다.
		
		String temp = scan.nextLine();
		int num1 = Integer.parseInt(temp);
		System.out.println("num1 -> " + num1);
		String str2 = scan.nextLine();
		System.out.println("str2 -> " + str2);
		
		
	}
}
