package List.arraylist_;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("java");
		list.add("jdbc");
		list.add("servlet/jsp");
		list.add(2, "Database");
		list.add("iBatis");
		
		int size = list.size();
		
		System.out.println("รั ผ๖" + size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println(skill);
		System.out.println();
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
		}
		
		list.remove(2);
		System.out.println();
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
		}
		
		list.remove("java");
		System.out.println();
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
		}
		
		}
		
	}


