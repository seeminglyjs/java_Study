package Generic.method2;

public class main {

	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<>(1,"���");
		Pair<Integer, String> p2 = new Pair<>(1,"���");
		
		//Util.<Integer,String>compare(p1, p2);
		boolean result1 = Util.compare(p1, p2); // �����ؼ� ������
	
		if(result1) {
			System.out.println("���� ���ü");
		}else {
			System.out.println("�ٸ� ��ü�̴�.");
		}
		
		
		Pair<String, String> p3 = new Pair<>("user1","���");
		Pair<String, String> p4 = new Pair<>("ȫ�浿","���");
		
		//Util.<Integer,String>compare(p1, p2);
		boolean result2 = Util.compare(p3, p4); // �����ؼ� ������
	
		if(result2) {
			System.out.println("���� ���ü");
		}else {
			System.out.println("�ٸ� ��ü�̴�.");
		}
		
	}
	

}
