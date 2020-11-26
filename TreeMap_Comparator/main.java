package TreeMap_Comparator;

import java.util.Iterator;
import java.util.TreeSet;

public class main {

	public static void main(String[] args) {
		TreeSet<fruit> treeSet = new TreeSet<fruit>(
				new DescendingComparator()
				
				);
		
		treeSet.add(new fruit("apple", 3000));
		treeSet.add(new fruit("aapple", 2000));
		treeSet.add(new fruit("aaapple", 9000));
	
		Iterator<fruit> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			fruit fruit = iterator.next();
			System.out.println(fruit.name + " - " + fruit.price);
		}
	}

}
