package gettersetter;

public class main {

	public static void main(String[] args) {
		
		stat character = new stat();
		//ĳ���� ��ü ����
				
		character.setPower(-1);
		character.setDex(-1);
		character.setIntel(-1);
		
		System.out.println("���� ���ɷ�ġ�� : " + character.getPower());
		System.out.println("���� ��ø�ɷ�ġ�� : " + character.getDex());
		System.out.println("���� ���ɴɷ�ġ�� : " + character.getIntel());
		
		
//		character.setPower(999);
//		character.setDex(999);
//		character.setIntel(999);
//		//setter �޼ҵ带 ���� ���Ⱥ� �ɷ�ġ ���
//		
//		System.out.println("���� ���ɷ�ġ�� : " + character.getPower());
//		System.out.println("���� ��ø�ɷ�ġ�� : " + character.getDex());
//		System.out.println("���� ���ɴɷ�ġ�� : " + character.getIntel());
		
	}

}
