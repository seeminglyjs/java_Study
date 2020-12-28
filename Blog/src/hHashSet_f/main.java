package hHashSet_f;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class main {

	public static void main(String[] args) {
		
//		Set<String> set = new HashSet<>();
//		//�������� ����Ǹ�, �ߺ��� ���� ������� �ʴ´�.
//		
//		set.add("aaa");
//		set.add("bbb");
//		set.add("ccc");
//		set.add("ddd");
//		set.remove("ccc");
//		
//		Iterator<String> it = set.iterator();
//		while(it.hasNext()) {
//			String str = it.next();
//			System.out.println(str);
//		}
		
		
		Set<People> pSet = new  HashSet<>();
		
		pSet.add(new People("aaa", 25));
		pSet.add(new People("bbb", 35));
		pSet.add(new People("ccc", 25));
		pSet.add(new People("aaa", 25));
		
		Iterator<People> itp = pSet.iterator();
		while(itp.hasNext()) {
			People p =itp.next();
			//Iterator��ü�� �ϳ��� �޴� People�� p ���� ����
			System.out.println(p.getName()+ " " + p.getAge());
			//p������ ���� name �� age�� ���
		}
		
		System.out.println("________________________");
		
		
		Stream<People> sSet = pSet.stream();
		//pSet�� ��Ʈ�� ���� sSet ����
		sSet.forEach(p -> System.out.println(p.getName() + " " + p.getAge()));
		//forEach�� ���� ��� ��ü�� �ϳ��� ���鼭 name�� age�� ����Ѵ�.
	}
}
