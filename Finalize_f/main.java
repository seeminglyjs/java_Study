package Finalize_f;

public class main {

	public static void main(String[] args) {

		for(int i = 0; i < 20; i++) {
		check test = new check(i);
		
		test = null;
		//null ���� �־� ������ �ִ� ���� ������� ����
		System.gc();
		//������ �÷��� ����
		//�����ǵ� finalize�� ����� �ٸ� ������� ���ŵ��� �ʰ� �������� ���ŵȴ�.
		//���� �����Ⱑ ��ٰ� �ؼ� �������� ������ �ʰ� �޸��� �뷮���θ� üũ�Ͽ� ���Ű� ����ȴ�.
		
		}
	}

}
