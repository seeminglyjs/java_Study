package hHashSet_f;

public class People {
	
	private String name;
	private int age;
	
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof People) {
			People human = (People) obj;
			return human.name.equals(name) && human.age == age;
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}

}
