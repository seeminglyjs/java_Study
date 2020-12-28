package hHashSet_f;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class main {

	public static void main(String[] args) {
		
//		Set<String> set = new HashSet<>();
//		//순서없이 저장되며, 중복된 값은 저장되지 않는다.
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
			//Iterator객체를 하나씩 받는 People의 p 변수 선언
			System.out.println(p.getName()+ " " + p.getAge());
			//p변수를 통해 name 과 age를 출력
		}
		
		System.out.println("________________________");
		
		
		Stream<People> sSet = pSet.stream();
		//pSet의 스트림 변수 sSet 선언
		sSet.forEach(p -> System.out.println(p.getName() + " " + p.getAge()));
		//forEach를 통해 모든 객체를 하나씩 돌면서 name과 age를 출력한다.
	}
}
