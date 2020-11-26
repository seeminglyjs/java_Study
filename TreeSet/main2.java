package TreeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class main2 {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		
		scores.add(new Integer(88));
		scores.add(new Integer(77));
		scores.add(new Integer(95));
		scores.add(new Integer(98));
		scores.add(new Integer(66));
		
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		//내림차순으로 정렬을 시킴
		for(Integer score : descendingSet) {
			System.out.print(score + " ");
		}
		System.out.println();
		
		NavigableSet<Integer> asendingSet =descendingSet.descendingSet();
		//다시 뒤집어 오름 차순이 된다.
		for(Integer score : asendingSet) {
			System.out.print(score + " ");
		}
	}

}
