
public class Overloading {
	String name;
	String sex;
	int age;
	
	public Overloading() {
	}
	
	public Overloading(String name) {
		this(name, "default", 0);
	}
	
	public Overloading(String name, String sex) {
		this(name, sex, 0);
	}
		
	public Overloading(String name, String sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	//�̸�, ����, ���� �Ű������� �޴� ������
}
