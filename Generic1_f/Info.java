package Generic1_f;

public class Info {
	public static <T,T2> void info(T t, T2 t2){
		// Ÿ�� �Ķ����  / ����Ÿ�� �Ķ���� or void / �޼ҵ�� �Ű����� Ÿ��
		man<T, T2> man2 = new man<>();
		man2.setName(t);
		man2.setAge(t2);
		
		System.out.println("���� �̸��� " + man2.getName() + " �Դϴ�.");
		System.out.println("���̴� " + man2.getAge() + " �Դϴ�.");
	}
}
