package Generic1_f;

public class mainGe {

	public static void main(String[] args) {
		
		System.out.println(man2.compareAge(100, 50));
		System.out.println(man2.compareAge(100, 50.1)); //double타입이 들어가도 자동으로 int타입으로 변환 후 비교
		//System.out.println(man2.compareAge(100, "50.1")); // String 타입이 들어갈 컴파일 오류
	
	}

}
