package aa_tTernary_f;

public class tTernary {

	public static void main(String[] args) {
		
		
		int a = 10;
		int b = 11;
		int c = 12;
		
		int max = a > b ? (a > c ? a : c) : (b > c ? b : c); 
		System.out.println("max - >  " + max);
		// �ִ��� ���ϴ� ���� ������
		
		int min = a > b ? (b < c ? b : c) : (a < c ? a : c); 
		System.out.println("max - >  " + min);
		// �ּڰ��� ���ϴ� ���� ������
		
//		int c = a > b ? a : b;
//		//c ���� b�� ���� �����ϰ� �ȴ�.
//		// ���� �������� �ڵ带 Ǯ�� �ϸ�
//		// a�� ���� b���� ū�� ? ũ���� a �̰� ũ�� ������ b�̴�.
//		// �̸� �ٽ� �� �� �ۼ��غ��� �Ʒ��� ����.
//		// a (���迬��) b ? true : false ������ ǥ���� �� ���� �� ����.
//		
//		System.out.println(c);
//		
//		//�׷� �ٸ� ���迬���ڸ� �־������� ���� �����ϴ��� �˾ƺ���.
//		//����� ���� ��Ÿ���� ���� true / false �� ����� ���� �־���. 
//		
//		System.out.println(a > b ? true : false);
//		System.out.println(a < b ? true : false);
//		System.out.println(a >= b ? true : false);
//		System.out.println(a <= b ? true : false);
//		System.out.println(a == b ? true : false);
//		System.out.println(a != b ? true : false);
//
//		
//		//��ó�� �ܼ��� ���ǽ� �񱳸� �� ��쿡�� if���� Ȱ���� ���� ������
//		//�ڵ���� ���鿡�� ���� �����ڸ� ���ؼ��� ���ϴ� �͵� ��� ���� ����� �� �� �ִ�.

	}
}
