package aa_aAnotation_f;

public @interface DefineAno {
	// interface �տ� ������ @�� �ٿ��ָ� ������̼� �������̽��� ���������.
	// anotation�� �ڽ��� element �� ���� ���� �ִ�.
	
	int numEl() default 1; 
	// int �� element�� ������ default ���� 1�̴�.
	String strEl();
	// String �� element�� ������ �ִ�.
	
}
