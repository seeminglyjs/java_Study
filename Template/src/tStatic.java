//static �� ���� �̷� ������ �� ����
public class tStatic {		
	static String people = "���";
	//����̶�� �ٺ����� ��ġ�� ������ ������, �������� Ư¡�̱� ������ static�� ������
	static String name = "ȫ�浿";
	//����� ������ �� �� �ֱ� ������ static�� �������� ����
	static int age = 20;
	//���̴� �ذ� ������ �ٲ�� ������ static�� �������� ����
	
	static String basicInfo;
	//�ʱⰪ�� ���� static ���
	static {
		basicInfo ="�ش� �ο��� �⺻ ���������� : " + people + " " + name + " " + age;
	}
	//static �����ڸ� ���� basicInfo�� �⺻���� ��������.
	
	void nextage(int age) {
		this.age = age;
	}
	//nextage�� ��� �ν��Ͻ� �ʵ带 �̿��ϱ� ������ static�� ������� ����
	static String hobby(String x) {
		return x;
	}
	//hobby�� ��� �ν��ͽ� �ʵ带 ������� �ʰ�,
	//�����Է� �޴� ���� �״�� ����ϱ� ������ static ����
}
