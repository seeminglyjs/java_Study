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
//		//���� ū�� ���� �޼���
//		min = tSet.first();
//		//���� ������ ���� �޼���
//		
//		System.out.println(max + " " + min);
//		
//		int temp = tSet.lower(max);
//		System.out.println("�ι�°�� ū �� = " + temp);
//		
//		temp = tSet.higher(min);
//		System.out.println("�ι�°�� ���� �� = " + temp);
////////////////////////////////////////////////////////////////////////////////////
		
//		NavigableSet<Integer> desc = tSet.descendingSet();
//		for(Integer d : desc) {
//			System.out.println(d);
//		}//�������� ����
//		
//		System.out.println("__________________________________________________");		
//		NavigableSet<Integer> asc = tSet.descendingSet().descendingSet();
//		for(Integer a : asc) {
//			System.out.println(a);
//		}//�������� ����
//////////////////////////////////////////////////////////////////////////////////////
//		System.out.println("__________________________________________________");
//		
		NavigableSet<Integer> sub = tSet.subSet(20, true, 40, true);
		for(Integer s : sub) {
			System.out.println(s);
		}//���� ���� ���
	}

}
