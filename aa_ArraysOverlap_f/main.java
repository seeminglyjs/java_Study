package aa_ArraysOverlap_f;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
//		//방법 1.
//		
//		int [] arr = {1,1,1,2,3,4,5,5,5,6,7};
//		//중복된 값을 다수 가지는 int 배열 선언
//		
//		Set<Integer> set = new HashSet<>();
//		// set의 자료 구조를 사용하는 것이다.
//		//set은 중복된 값을 중복 저장할 수 없기 때문에
//		// 중복된 값은 자동으로 처리해 중복되지 않은
//		//데이터만 저장된다. (다른 set 구조를 사용해도 된다.)
//		
//		for(int loop : arr) {
//			set.add(loop);
//		}// 배열의 있는 값을 하나씩 뽑아주준다.
//		
//		Stream<Integer> setS = set.stream();		
//		setS.forEach(out -> System.out.print(out + " "));
//		//그대로 set 자체로 출력하면 중복이 제거된 데이터만
//		// 출력되는 것을 확인할 수 있다.
//		
//		System.out.println();
//		int [] newArr = new int [set.size()];
//		Iterator<Integer> it = set.iterator();
//		for(int i = 0; i < newArr.length; i++ ) {
//			newArr[i] = it.next();
//			System.out.print(newArr[i] + " ");
//		}
//		
//		//위 처럼 새로운 배열을 만들어서 다시 set으로 넣어주면
//		// 다시 배열로도 사용할 수 있다.

////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
//		//방법 2.
		int [] arr = {1,1,1,2,3,4,5,5,5,6,7};
		//중복된 값을 다수 가지는 int 배열 선언
		
		ArrayList<Integer> list = new ArrayList<>();
		
		
		for(int checkData : arr) {
			if(!list.contains(checkData)) {
				//리스트의 contains 메서드를 활용해
				//리스트 내부의 데이터를 체크해 본다.
				//이후 중복 데이터가 없을 경우 그 값을 
				// add 를 통해 넣어준다.
				list.add(checkData);
			}
		}
		
		System.out.println(list);
		//출력결과 중복된 데이터를 제외하고 저장된 것을 확인할 수 있다.
		
		
		int [] newArr = new int [list.size()];
		// list의 크기 만큼 새로운 배열을 선언해준다.
		for(int i = 0; i < newArr.length; i++ ) {
			newArr[i] = list.get(i);
		}
		// get을 통해 중복값을 제외하고 선언한 배열에
		// 하나씩 넣어준다.
		
		
		for(int i = 0; i < newArr.length; i++ ) {
			System.out.print(newArr[i] + " ");
		}
		// list의 데이터를 그대로 담아주어 
		// 새로운 배열역시 중복된 값이 제거된 것을 확인할 수 있다.
		
	}

}
