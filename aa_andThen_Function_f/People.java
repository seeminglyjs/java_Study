package aa_andThen_Function_f;

public class People {
	private String name;
	private int age;
	private Info info; 
	// 클래스 Info를 필드 값으로 가진다.
	
	public People(String name, int age, Info info) {
		this.name = name;
		this.age = age;
		this.info = info;
	} // 생성자

	
	//// getter
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Info getInfo() {
		return info;
	}
	

}
