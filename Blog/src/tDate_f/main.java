package tDate_f;

import java.util.Date;
import java.text.SimpleDateFormat;

public class main {

	public static void main(String[] args) {
		Date day = new Date();
		System.out.println(day);
		//���糯¥ / �ð����� ����� �� ����
		//���ڿ����� �ٲٰ� ������ String ��ü�� toString���� ����ָ��.
		
		SimpleDateFormat fDay = new SimpleDateFormat("������ ��¥�� �ð��� yyyy�� MM�� dd�� E���� hh�� mm�� ss���Դϴ�.");
		String sfDay = fDay.format(day);
		System.out.println(sfDay);
		//�ڽŸ��� ���ϴ� ������ ���Ұ�� ����ó�� �����Ҽ� ����
	}

}
