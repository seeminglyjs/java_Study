package aa_dDeepClone_f;

import java.util.Arrays;

public class People implements Cloneable {
	String name;
	int [] bodyinfo; //Ű�� �����԰� ���� �� �迭
	Student student;
	
	public People(String name, int[] bodyinfo, Student student) {
		this.name = name;
		this.bodyinfo = bodyinfo;
		this.student = student;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		People cloneP = (People) super.clone();
		//���� ������ �������ش�. ������ super�� �̿��� object�� clone�޼��带 ȣ���Ѵ�.
		//return ���� object�̱� ������ People�� �������� ������ ������ ������ �߻��Ѵ�.
		
		cloneP.bodyinfo = Arrays.copyOf(this.bodyinfo, this.bodyinfo.length);
		//���� ���������� ������ �ִ� �迭��ü�� ������ ���ο� ��ü�� ����� �ִ� ���� 
		//Arrays.copyOf�� �Ű������� �����ϰ��� �ϴ� �迭�� �ش�迭�� ���̸� �־��ָ� �ȴ�.
		
		cloneP.student = new Student(this.student.grade);
		//Student�� Ŭ���� ������ �����ϰ� �־� ���ο� ��ü�� this�� �̿��� ���� ���� ������
		//���ο� ��ü�� ������ �ش�.
		
		return cloneP;

	}

	
	public People copyPeople() {
		People cloneP = null;
		//try ������ ����� ���ϰ��� ���� �� �־�
		//�ʱⰪ�� null�� �����Ѵ�.
		
		try {
			cloneP = (People) clone();
		}catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloneP;
		
	}
	
}
