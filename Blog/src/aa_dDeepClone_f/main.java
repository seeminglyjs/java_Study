package aa_dDeepClone_f;

public class main {

	public static void main(String[] args) {
			
		People people = new People("abc", new int[] {165, 55}, new Student(3));
		
		People cloneP = people.copyPeople();
		
		cloneP.bodyinfo[0] = 166;
		cloneP.student.grade = 4;
		
		
		System.out.println("������ �л��� �̸��� = " + cloneP.name);
		System.out.println("������ �л��� Ű�� �����Դ� = " + cloneP.bodyinfo[0] + " / " + cloneP.bodyinfo[1]);
		System.out.println("������ �л��� �г��� = " + cloneP.student.grade);
		
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("�л��� �̸��� = " + people.name);
		System.out.println("�л��� Ű�� �����Դ� = " + people.bodyinfo[0] + " / " + people.bodyinfo[1]);
		System.out.println("�л��� �г��� = " + people.student.grade);
		
		
		//��°�� ���� ������ �ҽ� ���� ���������� �ƴ� ���Ӱ� ���� ��ü�� ������ �����Ͽ�, ������ �����ʹ� ������ ����
		//�����ϴ� ���� Ȯ���� �� �ִ�.
		
	}

}
