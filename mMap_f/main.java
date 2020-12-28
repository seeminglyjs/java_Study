package mMap_f;

import java.util.HashMap;
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
//		//전체 키를 Set으로 받아서 넣는다.
//		Iterator<String> it = keySet.iterator();
//		//반복해서 키를 꺼내기 위해 Iterator에 해당 키를 다시 담는다.
//		while(it.hasNext()) {
//			String key = it.next();
//			//해당 키값을 변수에 담음
//			Integer value = map.get(key);
//			//키 값은 get에 넣어 해당 값을 찾음 
//			System.out.println(key + " = " + value);
//			//두가지 모두 출력
//		}
//		
//		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
//		//set에 map.entry 객체를 모두 담음
//		Iterator<Map.Entry<String, Integer>> entryIt= entrySet.iterator();
//		//마찬가지로 반복해서 키를 꺼내기 위해 Iterator에 해당 키를 다시 담는다.
//		while(entryIt.hasNext()) {
//			 System.out.println(entryIt.next());
//			 //반복자에 이미 키와 값이 모두 들어가 있어 next 메서드로 꺼내면된다.
//		}
		
//////////////////////////////////////////////////////////////////////////////////////////////////////
		
		Map<Human, Integer> map = new HashMap<>();
		
		map.put(new Human("aaa", "25"), 1);
		map.put(new Human("bbb", "25"), 2);
		map.put(new Human("ccc", "30"), 3);
		map.put(new Human("ddd", "30"), 4);
		map.put(new Human("fff", "40"), 5);	
		
		Set<Human> key1 = map.keySet();		
		//전체 키를 Set으로 받아서 넣는다.
		Iterator<Human> it1 = key1.iterator();
		//반복해서 키를 꺼내기 위해 Iterator에 해당 키를 다시 담는다.
		while(it1.hasNext()) {
			Human h = it1.next();
			int v = map.get(h);		
			System.out.println(h.getAge()  + " " + h.getName() + " " + v);
			//이후 get메서드를 통해 필드값들을 출력한다.
		}
		
		System.out.println("______________________________________________________________________________");
		Set<Map.Entry<Human, Integer>> key = map.entrySet();
		//맵에 구성요소 전체로 셋의 매개값으로 받아 변수에 저장
		Iterator<Map.Entry<Human, Integer>> it = key.iterator();
		//반복해서 하나씩 꺼내기 위해서 Iterator 변수에 다시 담아줌
		while(it.hasNext()) {
			//값이 있나 우선적 확인
			Map.Entry<Human, Integer> entry = it.next();
			//맵 엔트리 변수에 순서대로 하나씩 담아 초기화
			Human h = entry.getKey();
			//키 클래스의 변수에 키값 저장
			System.out.println(h.getAge() + " " +h.getName() + " " + entry.getValue());
		}
		
	
		
//		
//		Map<Human, Integer> map = new Hashtable<>();
//		//vector와 마찬가지로 멀티스레드 환경에서 안전한다.
//		map.put(new Human("aaa", "25"), 1);
//		map.put(new Human("bbb", "25"), 2);
//		map.put(new Human("ccc", "30"), 3);
//		map.put(new Human("ddd", "30"), 4);
//		map.put(new Human("fff", "40"), 5);
//		
//		Set<Human> set = map.keySet();
//		Iterator<Human> it = set.iterator();
//		while(it.hasNext()) {
//			Human h = it.next();
//			int v = map.get(h);
//			System.out.println(h.getAge()  + " " + h.getName() + " " + v);
//		}
//		
//		Set<Map.Entry<Human, Integer>> map1 = map.entrySet();
//		Iterator<Map.Entry<Human, Integer>> it1 = map1.iterator();
//		while(it1.hasNext()) {
//			Map.Entry<Human, Integer> entry = it1.next();
//			Human h = entry.getKey();
//			System.out.println(h.getAge()  + " " + h.getName() + " " + entry.getValue());
//		}

		
	}
}
