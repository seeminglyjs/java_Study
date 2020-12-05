package Generic1_f;

public class Info {
	public static <T,T2> void info(T t, T2 t2){
		// 타입 파라미터  / 리턴타입 파라미터 or void / 메소드명 매개변수 타입
		man<T, T2> man2 = new man<>();
		man2.setName(t);
		man2.setAge(t2);
		
		System.out.println("나의 이름은 " + man2.getName() + " 입니다.");
		System.out.println("나이는 " + man2.getAge() + " 입니다.");
	}
}
