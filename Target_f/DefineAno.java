package aa_aAnotation.Target_f;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.CONSTRUCTOR, //})
	      ElementType.METHOD, ElementType.FIELD})
//Target�� ����� ������̼��� ���� �� �ִ� ����� �����ϴ� ���̴�.
// ���� �Ű� ������ TYPE / CONSTRUCTOR / METHOD / FIELD
// �־���. CONSTRUCTOR / METHOD / FIELD 3 ������ �̸� �״��
// �����ڿ� �޼ҵ� �ʵ忡 ������̼��� ���� �� �ִٴ� �ǹ��̸�,
// TYPE �� Ŭ����,�������̽�,����Ÿ�Կ� ������̼��� ���� �� �ִٴ� �ǹ��̴�.

// ���⼭ Ÿ�� ElementType.METHOD, ElementType.FIELD �ΰ����� �ּ�ó���ϰ�
// �ٽ� TestTarget Ŭ������ ���캸��.

public @interface DefineAno {
	// interface �տ� ������ @�� �ٿ��ָ� ������̼� �������̽��� ���������.
	// anotation�� �ڽ��� element �� ���� ���� �ִ�.
	
	int numEl() default 1; 
	// int �� element�� ������ default ���� 1�̴�.
	String strEl();
	// String �� element�� ������ �ִ�.
	
}
