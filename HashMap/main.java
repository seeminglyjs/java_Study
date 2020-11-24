package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class main {

	public static void main(String[] args) {
		Map<String,Integer>map = new HashMap<String, Integer>();
		
		map.put("goo", 85);
		map.put("hoo", 77);
		map.put("yoo", 90);
		map.put("hoo", 85);
		//key 가 같으면 중복 저장 되지 않는다.
		System.out.println(map.size());
	
		System.out.println(map.get("hoo"));
		System.out.println();
		
		Set<String> keySet = map.keySet();	
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key + " " + value);
		}
		
		System.out.println();
		map.remove("goo");
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryInterator = entrySet.iterator();
		while(entryInterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryInterator.next();
			String key =entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " " + value);
		}
		
		
		map.clear();
		//전체삭제
		
	}

}
