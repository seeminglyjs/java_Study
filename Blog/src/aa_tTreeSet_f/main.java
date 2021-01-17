package aa_tTreeSet_f;

import java.util.NavigableSet;
import java.util.TreeSet;

public class main {

	public static void main(String[] args) {
		TreeSet<Integer> tSet = new TreeSet<>();
		tSet.add(10);
		tSet.add(20);
		tSet.add(30);
		tSet.add(40);
		tSet.add(50);
//		
//		Integer max = 0;
//		Integer min = 0;
//	
//		max = tSet.last();
//		//가장 큰값 리턴 메서드
//		min = tSet.first();
//		//가장 작은값 리턴 메서드
//		
//		System.out.println(max + " " + min);
//		
//		int temp = tSet.lower(max);
//		System.out.println("두번째로 큰 값 = " + temp);
//		
//		temp = tSet.higher(min);
//		System.out.println("두번째로 작은 값 = " + temp);
////////////////////////////////////////////////////////////////////////////////////
		
//		NavigableSet<Integer> desc = tSet.descendingSet();
//		for(Integer d : desc) {
//			System.out.println(d);
//		}//내림차순 정렬
//		
//		System.out.println("__________________________________________________");		
//		NavigableSet<Integer> asc = tSet.descendingSet().descendingSet();
//		for(Integer a : asc) {
//			System.out.println(a);
//		}//오름차순 정렬
//////////////////////////////////////////////////////////////////////////////////////
//		System.out.println("__________________________________________________");
//		
		NavigableSet<Integer> sub = tSet.subSet(20, true, 40, true);
		for(Integer s : sub) {
			System.out.println(s);
		}//범위 지정 출력
	}

}
