package aa_Arrays_Search_f;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		
		// �迭�� Ư�� �ε����� �����ϱ�
		// �迭�� Ư�� �����͸� �Է��ϸ�,
		// �ش� �����Ϳ� �´� �ε��� �ѹ��� �������ش�.
		
		String [] arr = {"a", "b", "c", "d","f"};
		
		int index = Arrays.binarySearch(arr, "d");
//		//binarySearch�� ����ϸ�ȴ�. 
//		// �Ű� �����δ� 1. �迭�� �̸� , 2. �ش� �迭�� ã���� �ϴ� ������
//		// ������ �ڵ带 �ۼ����ָ� �ȴ�.
//		
//		System.out.println(index + " �� �ش��ϴ� �� -> " + arr[index]);
		
		System.out.println();
		System.out.println("=============================================");
		try {
			index = Arrays.binarySearch(arr, "g");
			
			System.out.println(index + " �� �ش��ϴ� �� -> " + arr[index]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException ���ܰ� �߻��߽��ϴ�.");
		}
		
		

	}

}
