package aa_tThinClone_f;

public class main {

	public static void main(String[] args) {
			
		People people = new People("abc", 25);
		
		People cloneP = people.copyPeople();
		
		cloneP.name = "abb";
		cloneP.age = 35;
		
		
		System.out.println("복제된 학생의 이름은 = " + cloneP.name);
		System.out.println("복제된 학생의 나이는 = " + cloneP.age);
		
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("복제된 학생의 이름은 = " + people.name);
		System.out.println("복제된 학생의 나이는 = " + people.age);
		
		
		//얇은 복제를 통해 단순 필드값만 복제되어 원본데이터의 필드값 변경없이 안전하게 관리되는 것을 확인할 수 있다.
		//유지하는 것을 확인할 수 있다.
		
	}

}
