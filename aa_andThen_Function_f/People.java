package aa_andThen_Function_f;

public class People {
	private String name;
	private int age;
	private Info info; 
	// Ŭ���� Info�� �ʵ� ������ ������.
	
	public People(String name, int age, Info info) {
		this.name = name;
		this.age = age;
		this.info = info;
	} // ������

	
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
