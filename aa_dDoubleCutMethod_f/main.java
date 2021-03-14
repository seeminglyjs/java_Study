package aa_dDoubleCutMethod_f;

import java.text.DecimalFormat;

public class main {

	public static void main(String[] args) {
		
		//자바에서 소숫점을 반올림해서 원하는 자릿수 얻는 방법
		
		double num = 123.4567891011;
		
		// 위의 double형 변수와 같이 너무 긴 소숫점 자릿수를 가지면,
		// 상대적으로 데이터를 쉽게 파악하기 어려운 경우가 있다.
		// 때문에 보통 소숫점은 두자리나 첫자리 아니면 셋째 자리에서
		// 반올림하는 경우가 많은데, 이와 같은 방법을 몇가지 알아보도록 하자.
		
		
		//모든 기준은 소숫점 둘째자리까지 나타내는 것으로 하겠다.
		////////////////////////////////////////////////////////////////////////////
		// 방법 1. Math.round
		
//		double test = Math.round(num);
//		System.out.println(test);
//		// 라운드는 소숫점 첫째자리 기준으로 모두 올리거나 내리는 메서드이다.
//		// 이를 활용해서 소숫점을 반올림하는 것이다.
//		
//		double result1 = Math.round(num * 100) / 100.0;
//		System.out.println(result1);
//		// 둘째자리만 나타낼것이기 때문에 100을 곱해주고 차후에 100.0을 나누어 준다.
//		// 100으로 나누어주면 인트형으로 소숫점이 모두 0으로 리턴되기 때문에 100.0 을 나누어 주어야 한다.
		
		
		////////////////////////////////////////////////////////////////////////////
		// 방법 2. String.format
		
		
//		String result2 = String.format("%.2f", num);
//		System.out.println(result2);
//		// 두번째 방법은 String의 format 메서드를 활용하는 방법으로 매개값으로
//		// 출력하고싶은 형태와 출력할 변수 순으로 넣어주면 된다.
//		// 다만 리턴값은 String이기 때문에 String 변수에 담아주어야한다.
//		
//		System.out.printf("%.2f", num);
//		// 물로 바로 printf로 출력하는 방법도 가능하다.
//		// 단점으로는 return 값을 저장할 수 없다는 점이다.
//		System.out.println();
		
		////////////////////////////////////////////////////////////////////////////
		// 방법 3. DecimalFormat 클래스 활용하기
		
		DecimalFormat df = new DecimalFormat("0.00"); 
		//DecimalFormat df = new DecimalFormat("#.##"); 
		// 0.00 과 #.## 모두 가능하나 둘의 차이점은 만약에 1.1일 경우
		// 0.00 은 나머지 0의 자리를 절삭해 1.1만 출력하지만 #.##은 0을 절삭하지 않아
		// 1.10을 출력한다.
		String result3 = df.format(num);
		//역시 리턴값이 String이기 때문에 String 변수에 담아주면 된다.
		System.out.println(result3);
	}

}
