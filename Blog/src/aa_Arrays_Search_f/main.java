package aa_Arrays_Search_f;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		
		// 배열의 특정 인덱스값 추출하기
		// 배열의 특정 데이터를 입력하면,
		// 해당 데이터에 맞는 인덱스 넘버를 리턴해준다.
		
		String [] arr = {"a", "b", "c", "d","f"};
		
		int index = Arrays.binarySearch(arr, "d");
//		//binarySearch를 사용하면된다. 
//		// 매개 변수로는 1. 배열의 이름 , 2. 해당 배열의 찾고자 하는 데이터
//		// 순서로 코드를 작성해주면 된다.
//		
//		System.out.println(index + " 에 해당하는 값 -> " + arr[index]);
		
		System.out.println();
		System.out.println("=============================================");
		try {
			index = Arrays.binarySearch(arr, "g");
			
			System.out.println(index + " 에 해당하는 값 -> " + arr[index]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException 예외가 발생했습니다.");
		}
		
		

	}

}
