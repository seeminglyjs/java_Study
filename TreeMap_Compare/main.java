package TreeMap_Compare;

import java.util.Iterator;
import java.util.TreeSet;

public class main {

	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		treeSet.add(new Person("goo" , 45));
		treeSet.add(new Person("hoo" , 22));
		treeSet.add(new Person("qoo" , 33));
		//person�� comparable �޼ҵ� ������ �Ͽ� �ڵ� �����̵ȴ�.
		
		Iterator<Person> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + " - " + person.age);
		}
		
	}

}
