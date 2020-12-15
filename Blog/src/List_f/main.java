package List_f;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class main {

	public static void main(String[] args) {
//		List<Integer> list = new ArrayList<Integer>();
//		//초기 크기와는 상관없이 자동적으로 증가하게 된다.
//		//따라서 초기 크기를 지정해주지 않아도 크게 상관없다.
//		
//		list.add(100);
//		list.add(200);
//		//자료추가시 0부터 차례대로 추가가 된다.
//		list.remove(0);
//		
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
//		List<Human> slist = new ArrayList<Human>();
//		slist.add(new Human("aaa", "25age"));
//		slist.add(new Human("bbb", "30age"));
//		slist.add(new Human("ccc", "35age"));
//		
//		for(int i = 0; i < slist.size(); i++) {
//		Human human = slist.get(i);
//		//i 번째 생성자를 
//		System.out.println(human.getAge() + " " + human.getName());
//		} 
///////////////////////////////////////////////////////////////	
//		List<Integer> list1 = new Vector<>();
//		//기본적인 기능은 arrayList와 거의 동일 하지만 vector의 경우
//		//synchronized 메서드로 구성되어 있어 멀티 스레드가 동시에 실행할 수 없고
//		//하나의 스레드가 실행을 완요해야 다른 스레드가 실행된다.
//		//때문에 스레드가 안전하다고 할 수 있다.
//		list1.add(100);
//		list1.add(200);
//		//자료추가시 0부터 차례대로 추가가 된다.
//		list1.remove(0);
//		
//		for(int i = 0; i < list1.size(); i++) {
//			System.out.println(list1.get(i));
//		}
		
/////////////////////////////////////////////////////////////
//		
//		List<String> listA = new ArrayList<>();
//		List<String> listL = new LinkedList<>();
//		
//		//특정 인덱스의 객체를 제거하면 앞뒤 링크만 변경되고 나머지 링크는 변경되지 않는다.
//		//빈번히 객체 삭제와 삽입이 일어나는 곳에서는 ArrayList보다 성능이 좋다.
//		
//		long start;
//		long end; 
//		//시작시간과 끝나는 시간 저장변수
//		
//		start = System.nanoTime();
//		for(int i = 0; i < 20000; i++) {
//			listA.add(0, String.valueOf(i));
//			//0번째 위치를 계속해서 i값을 변경하는 작업 실시
//		}
//		end = System.nanoTime();
//		System.out.println("ArrayList 지속 변경 총시간  :" + (end - start) + "나노초");
//		
//		
//		start = System.nanoTime();
//		for(int i = 0; i < 20000; i++) {
//			listL.add(0, String.valueOf(i));
//			//0번째 위치를 계속해서 i값을 변경하는 작업 실시
//		}
//		end = System.nanoTime();
//		System.out.println("LinkedList 지속 변경 총시간 :" + (end - start) + "나노초");
//		
//		
//		start = System.nanoTime();
//		for(int i = 0; i < 20000; i++) {
//			listA.add(String.valueOf(i));
//			//0번째 위치를 계속해서 i값을 변경하는 작업 실시
//		}
//		end = System.nanoTime();
//		System.out.println("ArrayList 순차적 추가 총시간 :" + (end - start) + "나노초");
//		
//		start = System.nanoTime();
//		for(int i = 0; i < 20000; i++) {
//			listL.add(String.valueOf(i));
//			//0번째 위치를 계속해서 i값을 변경하는 작업 실시
//		}
//		end = System.nanoTime();
//		System.out.println("LinkedList 순차적 추가 총시간 :" + (end - start) + "나노초");
//		
		
		
		List<String> listL = new LinkedList<>();
		
		listL.add("a");
		listL.add("b");
		listL.add("c");
		listL.add("d");
		listL.add("f");
		
		listL.remove(1);
		
		for(int i = 0; i < listL.size(); i++) {
			System.out.println(i + " " + listL.get(i));
		}
		
		
	}

}
