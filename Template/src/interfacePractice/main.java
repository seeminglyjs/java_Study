package interfacePractice;

public class main {

	public static void main(String[] args) {
		
		top t = new top() {
			public void think() {
				System.out.println("�͸� ���� ��ü�� ����Ŭ������ ������� �ʰ� ��ȸ�� ���");
			}
		};
		t.think();
///////////////////////////////////////////////////////////////////////////////////////////////////////////
		move m = new move();
		m.act();
		m.up1();
		m.up2();
		m.think();
		m.speak(5);
		m.speak(14);
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////		
		full f = new full();
		System.out.println("______________________");
		System.out.println("�Ʒ��� �ڵ� Ÿ�Ժ�ȯ");
		f.fullmove(m);
		
	}

}
