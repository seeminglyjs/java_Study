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
		//������������ ������ ��Ŵ
		for(Integer score : descendingSet) {
			System.out.print(score + " ");
		}
		System.out.println();
		
		NavigableSet<Integer> asendingSet =descendingSet.descendingSet();
		//�ٽ� ������ ���� ������ �ȴ�.
		for(Integer score : asendingSet) {
			System.out.print(score + " ");
		}
	}

}
