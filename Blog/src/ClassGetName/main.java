package ClassGetName;

public class main {

	public static void main(String[] args) {
		Student student = new Student();
		//�л���ü ����
		
		Class clazz = student.getClass();
		//�л���ü�� ������ �޴� Ŭ���� ��ü ����
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getPackage().getName());
		System.out.println(clazz.getSimpleName());
		
		
		System.out.println("____________Ŭ������ ���� ��츦 ����� try catch ��_______________");
		try {
			Class clazz2 = Class.forName("classGetName.Student");
			//�������� ���� Ŭ�������� �Է��ϸ� catch ������ �̵��Ѵ�.
			//(�ñ��ϸ�, Student �ڿ� �ƹ� ���ڳ� �ٿ�����)
			System.out.println(clazz.getName());
			System.out.println(clazz.getPackage().getName());
			System.out.println(clazz.getSimpleName());
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	
	}

}
