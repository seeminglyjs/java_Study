package aa_String_trim_f;

public class main {

	public static void main(String[] args) {
		
		//���ڿ��� ���ʿ��� ������ �����ϴ� �޼��带 �˾ƺ���.
		
		String a = "       Hi Hi Hi!";
		String b = "Hi Hi Hi!       ";
		String c = " �ȳ��ϼ���     ~! ";
		
		// �� ������ a�� �տ� ���ʿ��� ���鹮��
		// b�� �ڿ� ���ʿ��� ���鹮��
		// c�� �յ� ���ʿ��� ���鹮�ڰ� �� �ִ�.
		
		//�̿� ���� �յ��� ���ʿ��� ������ �����ϱ� ���ؼ� 
		//String �� trim �޼��带 ����� �ָ�ȴ�.
		
		String newA = a.trim();
		System.out.println(newA);
		//�տ� ���ǿ��� ������ ���ŵȴ�.
		
		
		String newB = b.trim();
		System.out.println(newB);
		//���� ���ʿ��� ������ ���ŵȴ�.
		
		
		String newC = c.trim();
		System.out.println(newC);
		//�յ��� ���ʿ��� ������ ���ŵȴ�.
		
		//���⼭ �߿��� ���� trim �޼��带 ����Ѵٰ� �ؼ�
		//���ڿ� �߰��� �ִ� ������ ������� �ʴ´�.
		// ���� ���� c �� �ܼ� ��¹��� ���� ���� ���ذ� �� ���̴�.
		
		
	}

}
