package aa_tThinClone_f;

public class main {

	public static void main(String[] args) {
			
		People people = new People("abc", 25);
		
		People cloneP = people.copyPeople();
		
		cloneP.name = "abb";
		cloneP.age = 35;
		
		
		System.out.println("������ �л��� �̸��� = " + cloneP.name);
		System.out.println("������ �л��� ���̴� = " + cloneP.age);
		
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("������ �л��� �̸��� = " + people.name);
		System.out.println("������ �л��� ���̴� = " + people.age);
		
		
		//���� ������ ���� �ܼ� �ʵ尪�� �����Ǿ� ������������ �ʵ尪 ������� �����ϰ� �����Ǵ� ���� Ȯ���� �� �ִ�.
		//�����ϴ� ���� Ȯ���� �� �ִ�.
		
	}

}
