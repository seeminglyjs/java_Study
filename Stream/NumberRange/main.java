package Stream.NumberRange;

import java.util.stream.IntStream;

public class main {
	public static int sum;
	
	public static void main(String[] args) {
		IntStream stream = IntStream.range(1, 100);
		//intstream range�� ù��° ���ں��� �ڿ����ڱ��� ���ʴ�� �����Ѵ�.
		
		stream.forEachOrdered(a -> sum += a);
		//foreach���� ���� ���� �ϳ��� a�� �ְ� �� ���� sum�� ������Ų��.
		System.out.println(sum);
	}

}
