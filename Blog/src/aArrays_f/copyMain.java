package aArrays_f;

import java.util.Arrays;

public class copyMain {

	public static void main(String[] args) {
		
		int [] arr1 = {1, 2, 3, 4, 5};
		int [] arr3 = Arrays.copyOfRange(arr1, 0, 6);
		//Ư�������� �����ؼ� �ش�κи� ������ �� �ִ�.
		for(int i =0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		

	}

}
//int [] arr2 = Arrays.copyOf(arr1, arr1.length);
////�����ϰ����ϴ� �������� �迭 �ְ�, �����ϰ����ϴ� �ѹ����� �ڿ� �־���
//for(int i =0; i < arr2.length; i++) {
//	System.out.print(arr2[i] + " ");
//		System.out.println();}