package tFormat;

import java.text.DecimalFormat;

public class main {
//p545
	public static void main(String[] args) {
		// 0 10������ ���ڸ��� 0���� ä���.
		// # 10������ ���ڸ��� ä���� �ʴ´�.
		// . �Ҽ����� ǥ�� ex) #.0
		
		double num = 11111.1111;
		
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num)); 
		//�Ҽ��� ǥ�þ����־� ��¾ȵ�
		df = new DecimalFormat("0.0");
		System.out.println(df.format(num));
		//�ϳ��� ���־ �ϳ��� ��µ�
		df = new DecimalFormat("0000000000.00000000000");
		System.out.println(df.format(num));
		//�翷 ������ ä����
		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));
		//���������� ���ڸ��� ���
		df = new DecimalFormat("#########.##########");
		System.out.println(df.format(num));
		//���ڸ��� ������� �ʱ� ������ ���� ���ڸ� ����̵�
		df = new DecimalFormat("+#.0");
		System.out.println(df.format(num));
		//+ �Ǵ� - ��ȣ�� �����Ҽ��� ���� ���� �ٸ� �ƹ����ڳ� ���԰�����
		//�� �߰��� ���ڸ� ������ ��� �� ���ڰ� �ش� ���� �ǵڿ� ����
	}

}
