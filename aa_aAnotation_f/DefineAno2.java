package aa_aAnotation_f;

public @interface DefineAno2 {	
	int numEl() default 1; 
	// int �� element�� ������ default ���� 1�̴�.
	String value();
	// String �� element�� ������ �ִ�.
	// �⺻ ������Ʈ value;
	// �⺻������Ʈ�� ��� �Ű������� �ً� �������� �����ϰ�
	// ��(������) �� ���� �ִ�.
}
