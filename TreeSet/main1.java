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
		//자동박싱이 된다.
		System.out.println("95 > : " + score);
	
		score = scores.higher(95);
		//자동박싱이 된다.
		System.out.println("95 < : " + score);
	
		score = scores.floor(new Integer(95));
		//floor는 해당 점수도 포함된다. 없으면 95보다 바로적은 숫자 리턴
		System.out.println("95 >= : " +score);
		
		score = scores.ceiling(new Integer(85));
		//ceiling는 해당 점수도 포함된다. 없으면 85보다 바로 큰 숫자 리턴
		System.out.println("85 <= : " +score);
	
		/*
		 * while(!scores.isEmpty()) { score = scores.pollFirst(); //제일왼쪽 자식 노드 객체부터
		 * 스레드에서 뺌 //가져오고 해당 객체를 제거해버림 System.out.println(score + " remain : " +
		 * scores.size()); }
		 */
	
		
		while(!scores.isEmpty()) {
			score = scores.pollLast();
			//제일오른쪽자식 노드 객체부터 스레드에서 뺌
			//가져오고 해당 객체를 제거해버림
			System.out.println(score + " remain : " + scores.size());
		}
		
		Iterator<Integer> iterator = scores.iterator();
		while(iterator.hasNext()) {
			int s= iterator.next();
			System.out.println(s);
			
			//iterator는 가져올뿐 제거하지는 않는다.
		}
	}

}
