package aa_tTernary_f;

public class tTernary {

	public static void main(String[] args) {
		
		
		int a = 10;
		int b = 11;
		int c = 12;
		
		int max = a > b ? (a > c ? a : c) : (b > c ? b : c); 
		System.out.println("max - >  " + max);
		// 최댓값을 구하는 삼항 연산자
		
		int min = a > b ? (b < c ? b : c) : (a < c ? a : c); 
		System.out.println("max - >  " + min);
		// 최솟값을 구하는 삼항 연산자
		
//		int c = a > b ? a : b;
//		//c 값은 b의 값을 저장하게 된다.
//		// 삼항 연사자의 코드를 풀이 하면
//		// a의 값이 b보다 큰가 ? 크면은 a 이고 크지 않으면 b이다.
//		// 이를 다시 한 번 작성해보면 아래와 같다.
//		// a (관계연산) b ? true : false 정도로 표현할 수 있을 것 같다.
//		
//		System.out.println(c);
//		
//		//그런 다른 관계연산자를 넣었을때도 정상 동작하는지 알아보자.
//		//결과를 쉽게 나타내기 위해 true / false 로 변경된 값을 주었다. 
//		
//		System.out.println(a > b ? true : false);
//		System.out.println(a < b ? true : false);
//		System.out.println(a >= b ? true : false);
//		System.out.println(a <= b ? true : false);
//		System.out.println(a == b ? true : false);
//		System.out.println(a != b ? true : false);
//
//		
//		//이처럼 단순한 조건식 비교를 할 경우에는 if문을 활용할 수도 있지만
//		//코드길이 측면에서 삼항 연산자를 통해서도 비교하는 것도 어는 정도 고려해 볼 수 있다.

	}
}
