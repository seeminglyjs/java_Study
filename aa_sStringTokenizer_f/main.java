package aa_sStringTokenizer_f;

import java.util.StringTokenizer;

public class main {

	public static void main(String[] args) {
		
		//StringTokenizer �� Spring�� split���� �޸� ���ڷ� �����Ѵ�.
		
		String name = "aaa bbb ccc ddd fff";
		//���� �߰��� ���鹮�ڳ� Ư������ ���ſ� ���̾���.
		
		StringTokenizer st = new StringTokenizer(name, " ");
		//������ �������� ������ ���� �����ϳ��� �ϳ��� ��ū�� ������ StringTokenizer�� ����.
		
		
		while(st.hasMoreTokens()) { 
			// hasMoreTokens �ش� st�� ���̻��� ��ū�� �ִ��� 
			// üũ�ϴ� ���̴�.
			int count = st.countTokens();
			// -> ���� �����ִ� ��ü ��ū���� üũ�� �� �ִ�.
			System.out.println("���� �ִ� ��ū���� -> " + count );
			
			String nextSt = st.nextToken(); 
			// nextToken�� ���״�� ������ ��ū�� ������ �´�.
			// token�� ������ �ش� ��ū�� ��������.
			System.out.println("������ ��ū�� -> " + nextSt);
			System.out.println();
		}
		
				
		
	}

}
