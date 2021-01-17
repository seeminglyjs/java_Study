package aa_tTreeMap_f;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class main {

	public static void main(String[] args) {
		TreeMap<Integer, String> tMap = new TreeMap<Integer, String>();
		
		tMap.put(5, "fff");
		tMap.put(3, "bbb");
		tMap.put(2, "ccc");
		tMap.put(7, "ddd");
		tMap.put(1, "aaa");
		
//		Map.Entry<Integer, String> entry = null;
//		
//		entry = tMap.firstEntry();
//		System.out.println(entry.getKey() +" "+ entry.getValue() );
//		//가장 키값이 작은값  출력
//		
//		entry = tMap.lastEntry();
//		System.out.println(entry.getKey() +" "+ entry.getValue() );
//		//가장 키값이 큰값  출력
		
		
		
		System.out.println("__________________________________________________");			
		NavigableMap<Integer, String> desc = tMap.descendingMap();
		Set<Map.Entry<Integer,String>> descS = desc.entrySet();
		for(Map.Entry<Integer,String> entry1 : descS) {
			System.out.println(entry1.getKey() + " " + entry1.getValue());
		}
		
		
		
		
		System.out.println("__________________________________________________");				
		NavigableMap<Integer, String> asc = tMap.descendingMap().descendingMap();
		Set<Map.Entry<Integer,String>> ascS = asc.entrySet();
		for(Map.Entry<Integer,String> entry1 : ascS) {
			System.out.println(entry1.getKey() + " " + entry1.getValue());
		}
	
	}

}
