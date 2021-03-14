package aa_aAnotation_f;

public @interface DefineAno2 {	
	int numEl() default 1; 
	// int 형 element를 가지고 default 값은 1이다.
	String value();
	// String 형 element를 가지고 있다.
	// 기본 엘리먼트 value;
	// 기본엘리먼트의 경우 매개값으로 줄떄 변수명은 제외하고
	// 값(데이터) 줄 수가 있다.
}
