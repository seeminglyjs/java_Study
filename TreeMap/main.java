package TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class main {

	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<>();
		scores.put(87, "hooo");
		scores.put(67, "hhoo");
		scores.put(77, "hjjo");
		scores.put(97, "qeoo");
		scores.put(107, "tyoo");
		scores.put(447, "kloo");
		
		Map.Entry<Integer, String> entry = null;
		
		entry = scores.firstEntry();
		System.out.println("lowest  " + entry.getKey() + " - " + entry.getValue());
		
		entry = scores.lastEntry();
		System.out.println("highest  " + entry.getKey() + " - " + entry.getValue());
	
		entry = scores.lowerEntry(95);
		System.out.println("95 > : " + entry.getKey() + " - " + entry.getValue());
			
		entry = scores.higherEntry(95);
		System.out.println("95 < : " + entry.getKey() + " - " + entry.getValue());
	
		entry = scores.floorEntry(97);
		System.out.println("97 >= : " + entry.getKey() + " - " + entry.getValue());
	
		entry = scores.ceilingEntry(97);
		System.out.println("97 <= : " + entry.getKey() + " - " + entry.getValue());
		
		while(!scores.isEmpty()) {
			entry = scores.pollFirstEntry();
			//가장 왼쪽 부터 가져오고 빼버림
			System.out.println(entry);
		}
		
	}

}
