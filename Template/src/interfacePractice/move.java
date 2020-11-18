package interfacePractice;

public class move extends think implements arm1, arm2, body{
	// 구현하는 모든 인터페이스의  추상메소드를 정리해야지 사용 가능하다.
	@Override
	public void up1() {
		System.out.println("왼팔을 올립니다.");
	}
	
	@Override
	public void down1() {
		System.out.println("왼팔을 내립니다.");
	}
	
	@Override
	public void up2() {
		System.out.println("오른팔을 올립니다.");
	}
	
	@Override
	public void down2() {
		System.out.println("오른팔을 내립니다.");
	}
	
	@Override
	public void act() {
		System.out.println("움직입니다.");
	}
	
}
