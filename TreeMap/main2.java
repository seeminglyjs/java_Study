package TreeMap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class main2 {

	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<>();
		scores.put(87, "hooo");
		scores.put(67, "hhoo");
		scores.put(77, "hjjo");
		scores.put(97, "qeoo");
		scores.put(107, "tyoo");
		scores.put(447, "kloo");
		
		NavigableMap<Integer, String> map = scores.descendingMap();
		Set<Map.Entry<Integer, String>> descendingEntrySet = map.entrySet();
		for(Map.Entry<Integer, String> entry : descendingEntrySet) {
			System.out.print(entry.getKey() + "-" + entry.getValue() +" ");
		}
		System.out.println();
	
	
	}

}
