package TreeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class main3 {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		
		treeSet.add("apple");
		treeSet.add("bpple");
		treeSet.add("cpple");
		treeSet.add("dpple");
		treeSet.add("fpple");
		treeSet.add("gpple");
		
		
		System.out.println("-c ~ f-");
		NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);
	
		for(String word : rangeSet) {
			System.out.println(word);
		}
	}

}
