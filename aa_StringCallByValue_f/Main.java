package aa_StringCallByValue_f;

public class Main {
	
	public String strA; // 전역변수 선언
	public String strB; // 전역변수 선언
	
	
	
	public static void stringSwap1(String str1, String str2) {
		String temp = str1;
		str1 = str2;
		str2 = temp;
	}
	
	public static void stringSwap2(Main s) {
		//객체 자체를 매개값으로 받는다.
		String temp = s.strA;
		s.strA = s.strB ;
		s.strB  = temp;
	}
	
	//String 변수 2개를 전달받아 swap 해주는 간단한 메서드 선언
	
	public static void main(String[] args) {
		
//		String str1 = "aaa";
//		String str2 = "bbb";
//		System.out.println(str1 + " / " + str2);
//		
//		stringSwap1(str1, str2);
//		System.out.println(str1 + " / " + str2);
//		//참조형타입임에도 불구하고 swap 메서드를 사용해도
//		// 기존에 데이터가 그대로 유지되는 것을 확인할 수 있다.
//		// String은 Call by Value인 것을 확인할 수 있다.
//		
//		//이는 매개변수로 받은값과 기존의 변수 str1과 str2가 저장되는 공간이 다르기 때문이다.
		
////////////////////////////////////////////////////////////////////////////////////////////
		
		// 그러면 String을 Call by Reference 처럼 사용하는 방법은 바로
		// 변경하고자 하는 타입의 변수를 전역변수로 선언해 주면 된다.
		
		Main str = new Main();
		//객체를 생성해준다.
		str.strA = "aaa";
		str.strB = "bbb";
		
		System.out.println(str.strA + " / " + str.strB);
		
		stringSwap2(str);
		// 넘겨준 객체의 주소값이 전달되기 때문에
		// 메서드의 로직은 정상적으로 동작하여 서로 swap이 되게된다.
		System.out.println(str.strA + " / " + str.strB);
		
		
	}

}
