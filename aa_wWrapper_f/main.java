package aa_wWrapper_f;

import java.util.Date;

public class main {

	public static void main(String[] args) {
		
		//�ڹ��� �⺻ Ÿ����
		// byte, short char, int, long, float, double, boolean
		// �̷��� Ÿ������ ������� ��ü�� Wrapper ��ü��� �Ѵ�.
		// -> �⺻Ÿ���� ���� ���ο� �ΰ� �����ϱ� ������ ������ �̸��̴�.
		//���� Ŭ������ Ÿ���� �ַ� �⺻Ÿ�Կ��� �ձ��ڸ� �빮�ڷ� �ٲ�µ�,
		// ���ܴ� char - Character / int -> Integer�� �����̴�.
		
		// �⺻Ÿ���� ����Ÿ������ �ٲٴ� ���� �ڽ��̶�� �ϴµ�,
		// ����� �����Ѵ�.
		
		//****�ڽ̹��
//		Integer num1 = 10; // �ڵ� �ڽ�
//		Integer num2 = new Integer(100); 
//		Integer num3 = Integer.valueOf(1000); 
//		System.out.println(num1.getClass());
//		System.out.println(num2.getClass());
//		System.out.println(num3.getClass());
		
		// ���� ���� �����ϴ� ������ε� �����ϸ�,
		// new �� ����ϴ� ��� Integer.valueOf�� ����ϴ� ������ִ�.
//		
//		
		//****��ڽ̹��		
//		int numA = num1; // �ڵ� ��ڽ�
//		int numB = num2.intValue();
//		System.out.println(numA);
//		System.out.println(numB);
		
		// ���� int�� wrapper��ü�� �־��ִ� ���
		// intValue�� �̿��� ���� ������ Ǯ���ִ� ����� �ִ�.
		
		
		//****���ڿ��� �⺻ Ÿ������ ��ȯ
		
		//Wrapper Ŭ������ �̿��ϴ� �ֵ� ������ ���ڿ��� �⺻ Ÿ������ �ٲٴ� ����̴�.
		
//		int intSt = Integer.parseInt("100");
//		double doubleSt = Double.parseDouble("100.10");
//		long longSt = Long.parseLong("10000000000");
//		boolean booleanSt = Boolean.parseBoolean("false");
//		
//		System.out.println(intSt);
//		System.out.println(doubleSt);
//		System.out.println(longSt);
//		System.out.println(booleanSt);
//		
//		
//		
//		//****Wrapper Ŭ������ == != �� ���� ���� �񱳰� ���� �ʴ´�.
//		
		Integer numA = 200;
		Integer numB = 200;
		
		System.out.println(numA == numB);
		System.out.println(numA.equals(numB));
		
		// ���� ������ -128 ~ 127�� ������ ���� ��� == != �� �񱳰� ����������
		// �ش� ������ �Ѿ�� equals�� �񱳸� ���־�� �Ѵ�.

		}
	
	}
