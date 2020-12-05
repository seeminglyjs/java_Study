package Finalize_f;

public class main {

	public static void main(String[] args) {

		for(int i = 0; i < 20; i++) {
		check test = new check(i);
		
		test = null;
		//null 값을 넣어 기존에 있는 값을 쓰레기로 만듬
		System.gc();
		//가비지 컬렉터 실행
		//재정의된 finalize가 실행됨 다만 순서대로 제거되지 않고 무작위로 제거된다.
		//또한 쓰레기가 됬다고 해서 전부제거 되지는 않고 메모리의 용량여부를 체크하여 제거가 수행된다.
		
		}
	}

}
