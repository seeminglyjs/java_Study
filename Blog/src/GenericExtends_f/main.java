package GenericExtends_f;

public class main {

	public static void main(String[] args) {
		
		Character<Integer> ch = new RealCharacter<>();
		//�������̽� ��ü ����
		
		ch.Attack(100);
		ch.Defense(100);
		
	}
}


//Child<String, Integer, Integer> child = new Child<>();
////A,B,C�� �� Ÿ���� ��������
//
//child.setName("king");
//child.setAge(25);
//child.setMoney(25000);
//
//System.out.println(child.getName() + " / " +child.getAge() + " / " +child.getMoney());