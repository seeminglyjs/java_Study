package interfacePractice;

public class main {

	public static void main(String[] args) {
		
		top t = new top() {
			public void think() {
				System.out.println("익명 구현 개체는 구현클래스를 사용하지 않고 일회성 사용");
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
		System.out.println("아래는 자동 타입변환");
		f.fullmove(m);
		
	}

}
