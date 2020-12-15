package tFormat;

import java.text.DecimalFormat;

public class main {
//p545
	public static void main(String[] args) {
		// 0 10진수의 빈자리는 0으로 채운다.
		// # 10진수의 빈자리는 채우지 않는다.
		// . 소수점을 표현 ex) #.0
		
		double num = 11111.1111;
		
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num)); 
		//소숫점 표시안해주어 출력안됨
		df = new DecimalFormat("0.0");
		System.out.println(df.format(num));
		//하나만 해주어서 하나만 출력됨
		df = new DecimalFormat("0000000000.00000000000");
		System.out.println(df.format(num));
		//양옆 영으로 채워짐
		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));
		//마찬가지로 한자리만 출력
		df = new DecimalFormat("#########.##########");
		System.out.println(df.format(num));
		//빈자리는 출력하지 않기 때문에 원래 숫자만 출력이됨
		df = new DecimalFormat("+#.0");
		System.out.println(df.format(num));
		//+ 또는 - 기호를 삽입할수도 있음 물론 다른 아무문자나 삽입가능함
		//단 중간에 문자를 삽입할 경우 그 문자가 해당 숫자 맨뒤에 붙음
	}

}
