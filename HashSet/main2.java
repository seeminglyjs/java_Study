package HashSet;

import java.util.HashSet;
import java.util.Set;

public class main2 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("ȫ�浿", 30));
		set.add(new Member("ȫ�浿", 30));
		//���� ����Ǵ� ���� �ϳ���
		
		System.out.println("total entity : " + set.size());
	}

}
