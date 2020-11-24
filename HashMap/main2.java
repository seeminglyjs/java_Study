package HashMap;

import java.util.HashMap;
import java.util.Map;

public class main2 {

	public static void main(String[] args) {
		
		Map<Student, Integer>map = new HashMap<Student, Integer>();
		
		map.put(new Student(1,"È«±æµ¿"), 95);
		map.put(new Student(1,"È«±æµ¿"), 90);
		
		System.out.println("ÃÑ ¼ö" + map.size());	
		System.out.println(map.get(new Student(1,"È«±æµ¿")));
		
		 
	}

}
