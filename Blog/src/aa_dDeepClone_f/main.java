package aa_dDeepClone_f;

public class main {

	public static void main(String[] args) {
			
		People people = new People("abc", new int[] {165, 55}, new Student(3));
		
		People cloneP = people.copyPeople();
		
		cloneP.bodyinfo[0] = 166;
		cloneP.student.grade = 4;
		
		
		System.out.println("복제된 학생의 이름은 = " + cloneP.name);
		System.out.println("복제된 학생의 키와 몸무게는 = " + cloneP.bodyinfo[0] + " / " + cloneP.bodyinfo[1]);
		System.out.println("복제된 학생의 학년은 = " + cloneP.student.grade);
		
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("학생의 이름은 = " + people.name);
		System.out.println("학생의 키와 몸무게는 = " + people.bodyinfo[0] + " / " + people.bodyinfo[1]);
		System.out.println("학생의 학년은 = " + people.student.grade);
		
		
		//출력결과 깊은 복제를 할시 같은 참조번지가 아닌 새롭게 만든 객체의 번지를 참조하여, 기존의 데이터는 기존의 값을
		//유지하는 것을 확인할 수 있다.
		
	}

}
