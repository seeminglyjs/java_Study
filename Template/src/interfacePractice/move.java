package interfacePractice;

public class move extends think implements arm1, arm2, body{
	// �����ϴ� ��� �������̽���  �߻�޼ҵ带 �����ؾ��� ��� �����ϴ�.
	@Override
	public void up1() {
		System.out.println("������ �ø��ϴ�.");
	}
	
	@Override
	public void down1() {
		System.out.println("������ �����ϴ�.");
	}
	
	@Override
	public void up2() {
		System.out.println("�������� �ø��ϴ�.");
	}
	
	@Override
	public void down2() {
		System.out.println("�������� �����ϴ�.");
	}
	
	@Override
	public void act() {
		System.out.println("�����Դϴ�.");
	}
	
}
