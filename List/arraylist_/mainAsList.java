package List.arraylist_;

import java.util.Arrays;
import java.util.List;



public class mainAsList {

	public static void main(String[] args) {
		List<String> list1 =Arrays.asList("ȫ�浿", "ȫȫȫ", "������");
		for(String name : list1) {
			System.out.println(name);
		}
	
	
		List<Integer> list2 = Arrays.asList(2, 5, 10);
		for(int num : list2) {
			System.out.println(num);
		}	
	
	
	}

}
