package Stream.looping;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		int [] intArr = {1,2,3,4,5};
		
		
		Arrays.stream(intArr)
		.filter(a -> a%2 == 0)
		.peek(n -> System.out.println(n))
		//��ũ�� �߰�ó�� �޼ҵ��̱� ������ ���� ����ó�� �޼ҵ带 ȣ�����־� ������ �ȴ�.
		.sum();
		
		//�ܼ� foreach���� ����ϸ� �� ������ �ڵ尡 �ȴ�.
		Arrays.stream(intArr)
		.filter(a -> a%2 == 0)
		.forEach(n -> System.out.println(n));
	}

}
