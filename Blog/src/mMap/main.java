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
//		//�ʿ� ������� ��ü�� ���� �Ű������� �޾� ������ ����
//		Iterator<Map.Entry<Human, Integer>> it = key.iterator();
//		//�ݺ��ؼ� �ϳ��� ������ ���ؼ� Iterator ������ �ٽ� �����
//		while(it.hasNext()) {
//			//���� �ֳ� �켱�� Ȯ��
//			Map.Entry<Human, Integer> entry = it.next();
//			//�� ��Ʈ�� ������ ������� �ϳ��� ��� �ʱ�ȭ
//			Human h = entry.getKey();
//			//Ű Ŭ������ ������ Ű�� ����
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
		//vector�� ���������� ��Ƽ������ ȯ�濡�� �����Ѵ�.
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
