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
	//�����ڸ� ���� �� �ΰ��� ������ ������ ������ �ο��޴´�.
	
	// �޸� �������̽� ���� �κ�
	@Override
	public void name() {
		System.out.println("���� �̸��� " + name + " �Դϴ�.");
		
	}

	@Override
	public void age() {
		System.out.println("���� ���̴� " + age + " �Դϴ�.");
		
	}
	
	// ���� �������̽� �����κ�
	@Override
	public void species() {
		System.out.println("�� ������ " + species + " �Դϴ�.");
		
	}

	@Override
	public void sex() {
		System.out.println("�� ������ " + sex + " �Դϴ�.");
		
	}
	
}
