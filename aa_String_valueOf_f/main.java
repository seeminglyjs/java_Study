package aa_String_valueOf_f;

import java.io.ObjectInputStream.GetField;

public class main {

	public static void main(String[] args) {
				
		//���� Ÿ���� �������� ���ڿ��� �ٲپ��!
		
		int numInt = 100;
		long numLo = 1000;
		double numDou = 100.100;
		
		boolean flag = true;
		
		char ch = 'A';
		
		//���� ���� ��� Ÿ���� ���ڿ��� �ٲܼ� �ִ�.
		//�̸� �����ϰ� ���ִ� �޼��尡 �ٷ� valueOf�̴�.
		
		
		//����ȯ�� �ǽ��� ���� ����� ���ڿ��� �׿����� Ŭ������ 
		//String�� ���ϴ��� Ȯ���ϱ� ���� getClass�� �̿��� ���� Ŭ������ ��Ÿ���� �Ͽ���.
		String numIntS = String.valueOf(numInt);
		System.out.println(numIntS + " / " + numIntS.getClass());
		
		String numLoS = String.valueOf(numLo);
		System.out.println(numLoS + " / " + numLoS.getClass());
		
		String numDouS = String.valueOf(numDou);
		System.out.println(numDouS + " / " + numDouS.getClass());
		
		String flagS = String.valueOf(flag);
		System.out.println(flagS + " / " + flagS.getClass());
		
		String chS = String.valueOf(ch);
		System.out.println(chS + " / " + chS.getClass());

	}

}
