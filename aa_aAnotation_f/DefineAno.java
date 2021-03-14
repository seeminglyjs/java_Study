package aa_aAnotation_f;

public @interface DefineAno {
	// interface 앞에 간단히 @를 붙여주면 어노테이션 인터페이스가 만들어진다.
	// anotation은 자신의 element 를 가질 수가 있다.
	
	int numEl() default 1; 
	// int 형 element를 가지고 default 값은 1이다.
	String strEl();
	// String 형 element를 가지고 있다.
	
}
