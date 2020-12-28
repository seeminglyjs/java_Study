package aArrays_f;

import java.util.Arrays;

public class copyMain {

	public static void main(String[] args) {
		
		int [] arr1 = {1, 2, 3, 4, 5};
		int [] arr3 = Arrays.copyOfRange(arr1, 0, 6);
		//특정범위를 지정해서 해당부분만 복사할 수 있다.
		for(int i =0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		

	}

}
//int [] arr2 = Arrays.copyOf(arr1, arr1.length);
////복사하고자하는 오리지널 배열 넣고, 복사하고자하는 총범위를 뒤에 넣어줌
//for(int i =0; i < arr2.length; i++) {
//	System.out.print(arr2[i] + " ");
//		System.out.println();}