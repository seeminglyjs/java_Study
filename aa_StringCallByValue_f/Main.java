package aa_StringCallByValue_f;

public class Main {
	
	public String strA; // �������� ����
	public String strB; // �������� ����
	
	
	
	public static void stringSwap1(String str1, String str2) {
		String temp = str1;
		str1 = str2;
		str2 = temp;
	}
	
	public static void stringSwap2(Main s) {
		//��ü ��ü�� �Ű������� �޴´�.
		String temp = s.strA;
		s.strA = s.strB ;
		s.strB  = temp;
	}
	
	//String ���� 2���� ���޹޾� swap ���ִ� ������ �޼��� ����
	
	public static void main(String[] args) {
		
//		String str1 = "aaa";
//		String str2 = "bbb";
//		System.out.println(str1 + " / " + str2);
//		
//		stringSwap1(str1, str2);
//		System.out.println(str1 + " / " + str2);
//		//������Ÿ���ӿ��� �ұ��ϰ� swap �޼��带 ����ص�
//		// ������ �����Ͱ� �״�� �����Ǵ� ���� Ȯ���� �� �ִ�.
//		// String�� Call by Value�� ���� Ȯ���� �� �ִ�.
//		
//		//�̴� �Ű������� �������� ������ ���� str1�� str2�� ����Ǵ� ������ �ٸ��� �����̴�.
		
////////////////////////////////////////////////////////////////////////////////////////////
		
		// �׷��� String�� Call by Reference ó�� ����ϴ� ����� �ٷ�
		// �����ϰ��� �ϴ� Ÿ���� ������ ���������� ������ �ָ� �ȴ�.
		
		Main str = new Main();
		//��ü�� �������ش�.
		str.strA = "aaa";
		str.strB = "bbb";
		
		System.out.println(str.strA + " / " + str.strB);
		
		stringSwap2(str);
		// �Ѱ��� ��ü�� �ּҰ��� ���޵Ǳ� ������
		// �޼����� ������ ���������� �����Ͽ� ���� swap�� �ǰԵȴ�.
		System.out.println(str.strA + " / " + str.strB);
		
		
	}

}
