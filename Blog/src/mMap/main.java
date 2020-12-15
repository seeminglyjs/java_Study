package mMap;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class main {
	public static void main(String[] args) {
//		Map<String, Integer> map = new HashMap<>();
//		
//		map.put("a", 111);
//		map.put("b", 222);
//		map.put("c", 333);
//		map.put("d", 444);
//		map.put("f", 555);
//		
//		Set<String> keySet = map.keySet();
//		Iterator<String> it = keySet.iterator();
//		while(it.hasNext()) {
//			String key = it.next();
//			Integer value = map.get(key);
//			System.out.println(key + " = " + value);
//		}
//		
//		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
//		Iterator<Map.Entry<String, Integer>> entryIt= entrySet.iterator();
//		while(entryIt.hasNext()) {
//			 System.out.println(entryIt.next());
//		}
		
//////////////////////////////////////////////////////////////////////////////////////////////////////
		
//		Map<Human, Integer> map = new HashMap<>();
//		
//		map.put(new Human("aaa", "25"), 1);
//		map.put(new Human("bbb", "25"), 2);
//		map.put(new Human("ccc", "30"), 3);
//		map.put(new Human("ddd", "30"), 4);
//		map.put(new Human("fff", "40"), 5);
//		
//		Set<Map.Entry<Human, Integer>> key = map.entrySet();
//		//맵에 구성요소 전체로 셋의 매개값으로 받아 변수에 저장
//		Iterator<Map.Entry<Human, Integer>> it = key.iterator();
//		//반복해서 하나씩 꺼내기 위해서 Iterator 변수에 다시 담아줌
//		while(it.hasNext()) {
//			//값이 있나 우선적 확인
//			Map.Entry<Human, Integer> entry = it.next();
//			//맵 엔트리 변수에 순서대로 하나씩 담아 초기화
//			Human h = entry.getKey();
//			//키 클래스의 변수에 키값 저장
//			System.out.println(h.getAge() + " " +h.getName() + " " + entry.getValue());
//		}
//		System.out.println("______________________________________________________________________________");
//		Set<Human> key1 = map.keySet();
//		
//		Iterator<Human> it1 = key1.iterator();
//		while(it1.hasNext()) {
//			Human h = it1.next();
//			int v = map.get(h);
//			
//			System.out.println(h.getAge()  + " " + h.getName() + " " + v);
//		}
		
		
		Map<Human, Integer> map = new Hashtable<>();
		//vector와 마찬가지로 멀티스레드 환경에서 안전한다.
		map.put(new Human("aaa", "25"), 1);
		map.put(new Human("bbb", "25"), 2);
		map.put(new Human("ccc", "30"), 3);
		map.put(new Human("ddd", "30"), 4);
		map.put(new Human("fff", "40"), 5);
		
		Set<Human> set = map.keySet();
		Iterator<Human> it = set.iterator();
		while(it.hasNext()) {
			Human h = it.next();
			int v = map.get(h);
			System.out.println(h.getAge()  + " " + h.getName() + " " + v);
		}
		
		Set<Map.Entry<Human, Integer>> map1 = map.entrySet();
		Iterator<Map.Entry<Human, Integer>> it1 = map1.iterator();
		while(it1.hasNext()) {
			Map.Entry<Human, Integer> entry = it1.next();
			Human h = entry.getKey();
			System.out.println(h.getAge()  + " " + h.getName() + " " + entry.getValue());
		}
		
	}
}
