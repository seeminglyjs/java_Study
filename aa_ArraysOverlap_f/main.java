package aa_ArraysOverlap_f;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
//		//��� 1.
//		
//		int [] arr = {1,1,1,2,3,4,5,5,5,6,7};
//		//�ߺ��� ���� �ټ� ������ int �迭 ����
//		
//		Set<Integer> set = new HashSet<>();
//		// set�� �ڷ� ������ ����ϴ� ���̴�.
//		//set�� �ߺ��� ���� �ߺ� ������ �� ���� ������
//		// �ߺ��� ���� �ڵ����� ó���� �ߺ����� ����
//		//�����͸� ����ȴ�. (�ٸ� set ������ ����ص� �ȴ�.)
//		
//		for(int loop : arr) {
//			set.add(loop);
//		}// �迭�� �ִ� ���� �ϳ��� �̾����ش�.
//		
//		Stream<Integer> setS = set.stream();		
//		setS.forEach(out -> System.out.print(out + " "));
//		//�״�� set ��ü�� ����ϸ� �ߺ��� ���ŵ� �����͸�
//		// ��µǴ� ���� Ȯ���� �� �ִ�.
//		
//		System.out.println();
//		int [] newArr = new int [set.size()];
//		Iterator<Integer> it = set.iterator();
//		for(int i = 0; i < newArr.length; i++ ) {
//			newArr[i] = it.next();
//			System.out.print(newArr[i] + " ");
//		}
//		
//		//�� ó�� ���ο� �迭�� ���� �ٽ� set���� �־��ָ�
//		// �ٽ� �迭�ε� ����� �� �ִ�.

////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
//		//��� 2.
		int [] arr = {1,1,1,2,3,4,5,5,5,6,7};
		//�ߺ��� ���� �ټ� ������ int �迭 ����
		
		ArrayList<Integer> list = new ArrayList<>();
		
		
		for(int checkData : arr) {
			if(!list.contains(checkData)) {
				//����Ʈ�� contains �޼��带 Ȱ����
				//����Ʈ ������ �����͸� üũ�� ����.
				//���� �ߺ� �����Ͱ� ���� ��� �� ���� 
				// add �� ���� �־��ش�.
				list.add(checkData);
			}
		}
		
		System.out.println(list);
		//��°�� �ߺ��� �����͸� �����ϰ� ����� ���� Ȯ���� �� �ִ�.
		
		
		int [] newArr = new int [list.size()];
		// list�� ũ�� ��ŭ ���ο� �迭�� �������ش�.
		for(int i = 0; i < newArr.length; i++ ) {
			newArr[i] = list.get(i);
		}
		// get�� ���� �ߺ����� �����ϰ� ������ �迭��
		// �ϳ��� �־��ش�.
		
		
		for(int i = 0; i < newArr.length; i++ ) {
			System.out.print(newArr[i] + " ");
		}
		// list�� �����͸� �״�� ����־� 
		// ���ο� �迭���� �ߺ��� ���� ���ŵ� ���� Ȯ���� �� �ִ�.
		
	}

}
