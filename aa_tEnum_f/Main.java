package aa_tEnum_f;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String name = scan.next();
		// 임의이 이름을 입력받는다.
		// enum의 KING라는 이름과 같은지 비교를 해보자.
		
		Name realName = Name.KING;
		// enum 변수에 KING을 담아준다.
		
		if(name.equals(realName.name())) {
			// 타입이 enum이기 때문에
			// name 메소드로 String형태로 리턴되게 해준다.
			System.out.println("당신이 KING 이군요!!");
		}else {
			System.out.println("당신은 KING이 아니야!!!!!");
		}
		
	}

}
