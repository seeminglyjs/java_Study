package ClassGetName;

public class main {

	public static void main(String[] args) {
		Student student = new Student();
		//학생객체 생성
		
		Class clazz = student.getClass();
		//학생객체의 정보를 받는 클래스 객체 생성
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getPackage().getName());
		System.out.println(clazz.getSimpleName());
		
		
		System.out.println("____________클래스가 없을 경우를 대비한 try catch 문_______________");
		try {
			Class clazz2 = Class.forName("classGetName.Student");
			//존재하지 않을 클래스명을 입력하면 catch 문으로 이동한다.
			//(궁금하면, Student 뒤에 아무 문자나 붙여보자)
			System.out.println(clazz.getName());
			System.out.println(clazz.getPackage().getName());
			System.out.println(clazz.getSimpleName());
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	
	}

}
