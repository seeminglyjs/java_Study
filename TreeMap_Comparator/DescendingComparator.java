package TreeMap_Comparator;

import java.util.Comparator;

public class DescendingComparator implements Comparator<fruit> {
	@Override
	public int compare(fruit o1, fruit o2) {
		if(o1.price < o2.price) return 1; // ����� �������� //������ �ø�����
		else if(o1.price == o2.price) return 0;
		else return -1;
	}
}
