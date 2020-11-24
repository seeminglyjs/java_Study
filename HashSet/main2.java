package HashSet;

import java.util.HashSet;
import java.util.Set;

public class main2 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		//실제 저장되는 것은 하나뿐
		
		System.out.println("total entity : " + set.size());
	}

}
