package HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class main {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("java");
		set.add("jdbc");
		set.add("Servlet/jsp");
		set.add("java"); // 첫번째가 이걸로 변경됨
		set.add("i");
		
		int size= set.size(); // 4
		System.out.println(size);
		
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) { // true 나오면
			String element = iterator.next();
			System.out.println(element);
		}
		
		set.remove("jdbc");
		int size1= set.size(); //3
		System.out.println(size1);
		
		for(String element : set) {
			System.out.println(element);
		}
		set.clear();
		if(set.isEmpty()) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
	}

}
