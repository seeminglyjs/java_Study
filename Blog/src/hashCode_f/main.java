package hashCode_f;

import java.util.HashMap;

public class main {

	public static void main(String[] args) {
		HashMap<thashCode, String> test = new HashMap<thashCode, String>();
		//Ű���� thashCord�� �Ű����� String�� test hashmap ����
		
		test.put(new thashCode("1"), "�׽�Ʈ");
		
		String value = test.get(new thashCode("1"));
		//Ű�� 1�� ��ġ�� �׽�Ʈ�� �ҷ�����  value ���� ����
		System.out.println(value);
		//������ ��°�� null ���� �����

	}

}
