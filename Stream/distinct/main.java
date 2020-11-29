package Stream.distinct;

import java.util.Arrays;
import java.util.List;

public class main {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("aaa", "bbb", "ccc", "bbb", "ddd", "fff", "bgg");
		
		list.stream()
		.distinct()
		.forEach(n -> System.out.print(n+ " "));
		System.out.println();
		//�ߺ��� �� �����ϰ� ���
		
		
		list.stream()
		.filter(n -> n.startsWith("b"))
		.forEach(n ->System.out.print(n + " "));
		System.out.println();
		//���ڸ��� b�� �̸��� ���
		
		list.stream()
		.distinct()
		.filter(n->n.startsWith("b"))
		.forEach(n-> System.out.print(n + " "));
		//�ߺ��� �� ������ ���ڸ��� b�� �͸� ���
		
	}

}
