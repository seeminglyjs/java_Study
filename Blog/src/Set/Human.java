package Set;

public class Human {
	
	private String name;
	private String age;
	
	public Human(String name, String age) {
		this.name = name;
		this.age = age;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Human) {
			Human human = (Human) obj;
			return human.name.equals(name) && human.age.equals(age);
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age.hashCode();
	}

}
