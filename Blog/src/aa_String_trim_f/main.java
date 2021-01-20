package aa_String_trim_f;

public class main {

	public static void main(String[] args) {
		
		//문자열의 불필요한 공백을 제거하는 메서드를 알아보자.
		
		String a = "       Hi Hi Hi!";
		String b = "Hi Hi Hi!       ";
		String c = " 안녕하세요     ~! ";
		
		// 각 변수별 a는 앞에 불필요한 공백문자
		// b는 뒤에 불필요한 공백문자
		// c는 앞뒤 불필요한 공백문자가 들어가 있다.
		
		//이와 같은 앞뒤의 불필요한 공백을 제거하기 위해서 
		//String 의 trim 메서드를 사용해 주면된다.
		
		String newA = a.trim();
		System.out.println(newA);
		//앞에 불피용한 공백이 제거된다.
		
		
		String newB = b.trim();
		System.out.println(newB);
		//뒤의 불필요한 공백이 제거된다.
		
		
		String newC = c.trim();
		System.out.println(newC);
		//앞뒤의 불필요한 공백이 제거된다.
		
		//여기서 중요한 점은 trim 메서드를 사용한다고 해서
		//문자열 중간에 있는 공백을 사라지지 않는다.
		// 예제 변수 c 의 콘솔 출력문을 보면 쉽게 이해가 될 것이다.
		
		
	}

}
