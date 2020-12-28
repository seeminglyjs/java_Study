package tObject_f;

import java.util.Comparator;
import java.util.Objects;

public class main {

	public static void main(String[] args) {
		compare c1 = new compare();
		compare c2 = new compare();
		
		c1.setNum(5);		
		c2.setNum(10);		
		int result1 =Objects.compare(c1, c2, new compare());
		System.out.println(result1);
		//c2가 더커서 -1 출력
		
		c1.setNum(50);
		c2.setNum(10);
		int result2 =Objects.compare(c1, c2, new compare());
		System.out.println(result2);
		//c1이 더커서 1출력
	}

}
