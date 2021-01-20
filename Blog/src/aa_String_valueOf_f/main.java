package aa_String_valueOf_f;

import java.io.ObjectInputStream.GetField;

public class main {

	public static void main(String[] args) {
				
		//각종 타입의 변수들을 문자열로 바꾸어보자!
		
		int numInt = 100;
		long numLo = 1000;
		double numDou = 100.100;
		
		boolean flag = true;
		
		char ch = 'A';
		
		//위와 같은 모든 타입을 문자열로 바꿀수 있다.
		//이를 가능하게 해주는 메서드가 바로 valueOf이다.
		
		
		//형변환을 실시한 이유 변경된 문자열과 그에따른 클래스가 
		//String에 속하는지 확인하기 위해 getClass를 이용해 속한 클래스를 나타내게 하였다.
		String numIntS = String.valueOf(numInt);
		System.out.println(numIntS + " / " + numIntS.getClass());
		
		String numLoS = String.valueOf(numLo);
		System.out.println(numLoS + " / " + numLoS.getClass());
		
		String numDouS = String.valueOf(numDou);
		System.out.println(numDouS + " / " + numDouS.getClass());
		
		String flagS = String.valueOf(flag);
		System.out.println(flagS + " / " + flagS.getClass());
		
		String chS = String.valueOf(ch);
		System.out.println(chS + " / " + chS.getClass());

	}

}
