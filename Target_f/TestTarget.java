package aa_aAnotation.Target_f;

@DefineAno(strEl = "클래스")
public class TestTarget {
	
	@DefineAno(strEl = "필드")
	int num;
	
	@DefineAno(strEl = "생성자")
	public TestTarget() {
	}
	
	@DefineAno(strEl = "메소드")
	public void out() {
		System.out.println("Method");
	}
	
	// 위의 코드와 같이 타겟에 선언된 유형에는 어노테이션을
	// 부착할 수 있다.
}
