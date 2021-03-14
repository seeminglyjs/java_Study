package aa_dDeepClone_f;

import java.util.Arrays;

public class People implements Cloneable {
	String name;
	int [] bodyinfo; //키와 몸무게가 같이 들어갈 배열
	Student student;
	
	public People(String name, int[] bodyinfo, Student student) {
		this.name = name;
		this.bodyinfo = bodyinfo;
		this.student = student;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		People cloneP = (People) super.clone();
		//얇은 복제를 먼저해준다. 때문에 super를 이용해 object의 clone메서드를 호출한다.
		//return 값이 object이기 떄문에 People로 감싸주지 않으면 컴파일 오류가 발생한다.
		
		cloneP.bodyinfo = Arrays.copyOf(this.bodyinfo, this.bodyinfo.length);
		//같은 참조번지를 가지고 있는 배열객체를 복사해 새로운 객체로 만들어 주는 과정 
		//Arrays.copyOf의 매개변수는 복사하고자 하는 배열과 해당배열의 길이를 넣어주면 된다.
		
		cloneP.student = new Student(this.student.grade);
		//Student의 클래스 번지를 참조하고 있어 새로운 객체를 this를 이용해 같은 값을 가지는
		//새로운 객체로 선언해 준다.
		
		return cloneP;

	}

	
	public People copyPeople() {
		People cloneP = null;
		//try 구문의 실행실 리턴값이 없을 수 있어
		//초기값을 null로 선언한다.
		
		try {
			cloneP = (People) clone();
		}catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloneP;
		
	}
	
}
