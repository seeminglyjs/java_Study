package aa_aAnotation.Target_f;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.CONSTRUCTOR, //})
	      ElementType.METHOD, ElementType.FIELD})
//Target의 기능은 어노테이션을 붙일 수 있는 대상을 지정하는 것이다.
// 위의 매개 변수로 TYPE / CONSTRUCTOR / METHOD / FIELD
// 주었다. CONSTRUCTOR / METHOD / FIELD 3 가지는 이름 그대로
// 생성자와 메소드 필드에 어노테이션을 붙일 수 있다는 의미이며,
// TYPE 는 클래스,인터페이스,열거타입에 어노테이션을 붙일 수 있다는 의미이다.

// 여기서 타겟 ElementType.METHOD, ElementType.FIELD 두가지를 주석처리하고
// 다시 TestTarget 클래스를 살펴보자.

public @interface DefineAno {
	// interface 앞에 간단히 @를 붙여주면 어노테이션 인터페이스가 만들어진다.
	// anotation은 자신의 element 를 가질 수가 있다.
	
	int numEl() default 1; 
	// int 형 element를 가지고 default 값은 1이다.
	String strEl();
	// String 형 element를 가지고 있다.
	
}
