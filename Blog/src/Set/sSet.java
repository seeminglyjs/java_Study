package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class sSet {

	public static void main(String[] args) {
		
		Set<Human> set = new HashSet<>();
		
		set.add(new Human("aaa", "25"));
		set.add(new Human("aaa", "25"));
		set.add(new Human("bbb", "25"));
		set.add(new Human("bbb", "25"));
		//equal ���� ���� ������ ���ڿ������� ���ϰ� �ȴ�.
		
		Iterator<Human> it = set.iterator();
		
		while(it.hasNext()) {
			Human h = it.next();
			System.out.println(h.getAge() + " " +  h.getName());
		}
		
	}

}
