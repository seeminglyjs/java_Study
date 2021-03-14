package aa_aAnotation_f;

public class Test {

	@DefineAno(strEl = "a")
	// numEl은 default(정수 '1' ) 값이 있기 때문에 따로 매개값을 주지 않아도 된다.
	// strEl은 초기 default 값이 없어 초기값은 매개값으로 넣어주어야한다.
	// strEl의 매개값을 주지 않을 경우에는 compile시 오류가 발생한다.
	public void out1() {
		// 엘리먼트를 통해서 자바의 런타임(동작)동안 필요한 메타데이터를 얻을 수도 있다.
		// 이를 리플렉션이라고도 한다.
	}	
	
	@DefineAno2("a")
	// 단 엘리먼트의 값을 두개 이상 지정할때에는 반드시
	// 엘리먼트 value의 값을 넣어 준다는 것을 명시해 주어야한다.
	// @DefineAno2(value = "a", numEl = 10)
	// 위 처럼 작성해주어야 한다.
	public void out2() {
	}
	
}
