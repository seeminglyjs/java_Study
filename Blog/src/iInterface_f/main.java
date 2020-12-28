package iInterface_f;

public class main {

	public static void main(String[] args) {
		
		
		integrated it = new integrated("king", 25, "Lion", "수컷");
		//생성자로 데이터를 입력받는다.
		
		it.name();
		it.age();
		System.out.println("________________");
		System.out.println();
		it.species();
		it.sex();

	}

}
