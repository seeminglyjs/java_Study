package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class main1 {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		
		scores.add(new Integer(88));
		scores.add(new Integer(77));
		scores.add(new Integer(95));
		scores.add(new Integer(98));
		scores.add(new Integer(66));
		
		Integer score = null;
		
		score = scores.first();
		System.out.println("lowest : " + score);
		
		score = scores.last();
		System.out.println("highest : " + score);
	
		score = scores.lower(95);
		//�ڵ��ڽ��� �ȴ�.
		System.out.println("95 > : " + score);
	
		score = scores.higher(95);
		//�ڵ��ڽ��� �ȴ�.
		System.out.println("95 < : " + score);
	
		score = scores.floor(new Integer(95));
		//floor�� �ش� ������ ���Եȴ�. ������ 95���� �ٷ����� ���� ����
		System.out.println("95 >= : " +score);
		
		score = scores.ceiling(new Integer(85));
		//ceiling�� �ش� ������ ���Եȴ�. ������ 85���� �ٷ� ū ���� ����
		System.out.println("85 <= : " +score);
	
		/*
		 * while(!scores.isEmpty()) { score = scores.pollFirst(); //���Ͽ��� �ڽ� ��� ��ü����
		 * �����忡�� �� //�������� �ش� ��ü�� �����ع��� System.out.println(score + " remain : " +
		 * scores.size()); }
		 */
	
		
		while(!scores.isEmpty()) {
			score = scores.pollLast();
			//���Ͽ������ڽ� ��� ��ü���� �����忡�� ��
			//�������� �ش� ��ü�� �����ع���
			System.out.println(score + " remain : " + scores.size());
		}
		
		Iterator<Integer> iterator = scores.iterator();
		while(iterator.hasNext()) {
			int s= iterator.next();
			System.out.println(s);
			
			//iterator�� �����û� ���������� �ʴ´�.
		}
	}

}
