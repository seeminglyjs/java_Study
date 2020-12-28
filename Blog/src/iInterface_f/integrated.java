package iInterface_f;

public class integrated implements human, animal {
	private String name;
	private int age;
	private String sex;
	private String species;
	
	public integrated(String name, int age, String species, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.species = species;
	}
	//생성자를 통해 각 인간의 정보와 동물의 정보를 부여받는다.
	
	// 휴먼 인터페이스 구현 부분
	@Override
	public void name() {
		System.out.println("저의 이름은 " + name + " 입니다.");
		
	}

	@Override
	public void age() {
		System.out.println("저의 나이는 " + age + " 입니다.");
		
	}
	
	// 동물 인터페이스 구현부분
	@Override
	public void species() {
		System.out.println("이 동물은 " + species + " 입니다.");
		
	}

	@Override
	public void sex() {
		System.out.println("이 동물은 " + sex + " 입니다.");
		
	}
	
}
