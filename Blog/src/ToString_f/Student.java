package ToString_f;

public class Student {
	private String name;
	private String sex;
	
	public Student(String name, String sex) {
		this.name = name;
		this.sex = sex;
	}
	
	@Override
	public String toString() {
		return "�̸��� " +name + "�̰� ������ " + sex + "�Դϴ�. ";
	}
	
}
