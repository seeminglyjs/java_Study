package List_f;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class main {

	public static void main(String[] args) {
//		List<Integer> list = new ArrayList<Integer>();
//		//�ʱ� ũ��ʹ� ������� �ڵ������� �����ϰ� �ȴ�.
//		//���� �ʱ� ũ�⸦ ���������� �ʾƵ� ũ�� �������.
//		
//		list.add(100);
//		list.add(200);
//		//�ڷ��߰��� 0���� ���ʴ�� �߰��� �ȴ�.
//		list.remove(0);
//		
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
//		List<Human> slist = new ArrayList<Human>();
//		slist.add(new Human("aaa", "25age"));
//		slist.add(new Human("bbb", "30age"));
//		slist.add(new Human("ccc", "35age"));
//		
//		for(int i = 0; i < slist.size(); i++) {
//		Human human = slist.get(i);
//		//i ��° �����ڸ� 
//		System.out.println(human.getAge() + " " + human.getName());
//		} 
///////////////////////////////////////////////////////////////	
//		List<Integer> list1 = new Vector<>();
//		//�⺻���� ����� arrayList�� ���� ���� ������ vector�� ���
//		//synchronized �޼���� �����Ǿ� �־� ��Ƽ �����尡 ���ÿ� ������ �� ����
//		//�ϳ��� �����尡 ������ �Ͽ��ؾ� �ٸ� �����尡 ����ȴ�.
//		//������ �����尡 �����ϴٰ� �� �� �ִ�.
//		list1.add(100);
//		list1.add(200);
//		//�ڷ��߰��� 0���� ���ʴ�� �߰��� �ȴ�.
//		list1.remove(0);
//		
//		for(int i = 0; i < list1.size(); i++) {
//			System.out.println(list1.get(i));
//		}
		
/////////////////////////////////////////////////////////////
//		
//		List<String> listA = new ArrayList<>();
//		List<String> listL = new LinkedList<>();
//		
//		//Ư�� �ε����� ��ü�� �����ϸ� �յ� ��ũ�� ����ǰ� ������ ��ũ�� ������� �ʴ´�.
//		//����� ��ü ������ ������ �Ͼ�� �������� ArrayList���� ������ ����.
//		
//		long start;
//		long end; 
//		//���۽ð��� ������ �ð� ���庯��
//		
//		start = System.nanoTime();
//		for(int i = 0; i < 20000; i++) {
//			listA.add(0, String.valueOf(i));
//			//0��° ��ġ�� ����ؼ� i���� �����ϴ� �۾� �ǽ�
//		}
//		end = System.nanoTime();
//		System.out.println("ArrayList ���� ���� �ѽð�  :" + (end - start) + "������");
//		
//		
//		start = System.nanoTime();
//		for(int i = 0; i < 20000; i++) {
//			listL.add(0, String.valueOf(i));
//			//0��° ��ġ�� ����ؼ� i���� �����ϴ� �۾� �ǽ�
//		}
//		end = System.nanoTime();
//		System.out.println("LinkedList ���� ���� �ѽð� :" + (end - start) + "������");
//		
//		
//		start = System.nanoTime();
//		for(int i = 0; i < 20000; i++) {
//			listA.add(String.valueOf(i));
//			//0��° ��ġ�� ����ؼ� i���� �����ϴ� �۾� �ǽ�
//		}
//		end = System.nanoTime();
//		System.out.println("ArrayList ������ �߰� �ѽð� :" + (end - start) + "������");
//		
//		start = System.nanoTime();
//		for(int i = 0; i < 20000; i++) {
//			listL.add(String.valueOf(i));
//			//0��° ��ġ�� ����ؼ� i���� �����ϴ� �۾� �ǽ�
//		}
//		end = System.nanoTime();
//		System.out.println("LinkedList ������ �߰� �ѽð� :" + (end - start) + "������");
//		
		
		
		List<String> listL = new LinkedList<>();
		
		listL.add("a");
		listL.add("b");
		listL.add("c");
		listL.add("d");
		listL.add("f");
		
		listL.remove(1);
		
		for(int i = 0; i < listL.size(); i++) {
			System.out.println(i + " " + listL.get(i));
		}
		
		
	}

}
