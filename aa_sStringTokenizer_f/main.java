package aa_sStringTokenizer_f;

import java.util.StringTokenizer;

public class main {

	public static void main(String[] args) {
		
		//StringTokenizer 는 Spring의 split과는 달리 문자로 구분한다.
		
		String name = "aaa bbb ccc ddd fff";
		//보통 중간에 공백문자나 특수문자 제거에 많이쓴다.
		
		StringTokenizer st = new StringTokenizer(name, " ");
		//구분자 공백으로 나누어 각각 문자하나당 하나의 토큰을 가지는 StringTokenizer를 생성.
		
		
		while(st.hasMoreTokens()) { 
			// hasMoreTokens 해당 st에 더이상의 토큰이 있는지 
			// 체크하는 것이다.
			int count = st.countTokens();
			// -> 현재 남아있는 전체 토큰수를 체크할 수 있다.
			System.out.println("남아 있는 토큰수는 -> " + count );
			
			String nextSt = st.nextToken(); 
			// nextToken은 말그대로 다음의 토큰을 가지고 온다.
			// token을 꺼내면 해당 토큰을 없어진다.
			System.out.println("추출한 토큰은 -> " + nextSt);
			System.out.println();
		}
		
				
		
	}

}
