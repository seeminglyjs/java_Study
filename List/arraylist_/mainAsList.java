package List.arraylist_;

import java.util.Arrays;
import java.util.List;



public class mainAsList {

	public static void main(String[] args) {
		List<String> list1 =Arrays.asList("全辨悼", "全全全", "癌癌癌");
		for(String name : list1) {
			System.out.println(name);
		}
	
	
		List<Integer> list2 = Arrays.asList(2, 5, 10);
		for(int num : list2) {
			System.out.println(num);
		}	
	
	
	}

}
