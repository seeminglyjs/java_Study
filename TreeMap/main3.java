package TreeMap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class main3 {
	
	public static void main(String[] args) {
	
	TreeMap<String,Integer> treeMap = new TreeMap<>();
	treeMap.put("apple", 10);
	treeMap.put("bpple", 30);
	treeMap.put("cpple", 50);
	treeMap.put("dpple", 70);
	treeMap.put("fpple", 20);
	treeMap.put("gpple", 15);
	treeMap.put("hpple", 25);
	
	System.out.println("-c ~ f-");
	NavigableMap<String, Integer> rangeMap = treeMap.subMap("c", true, "f", true);
	for(Map.Entry<String, Integer> entry : rangeMap.entrySet()) {
		System.out.println(entry.getKey() + " " + entry.getValue());
	}
	
	
	}
}