package gettersetter;

public class main {

	public static void main(String[] args) {
		
		stat character = new stat();
		//캐릭터 객체 생성
				
		character.setPower(-1);
		character.setDex(-1);
		character.setIntel(-1);
		
		System.out.println("나의 힘능력치는 : " + character.getPower());
		System.out.println("나의 민첩능력치는 : " + character.getDex());
		System.out.println("나의 지능능력치는 : " + character.getIntel());
		
		
//		character.setPower(999);
//		character.setDex(999);
//		character.setIntel(999);
//		//setter 메소드를 통해 스탯별 능력치 배분
//		
//		System.out.println("나의 힘능력치는 : " + character.getPower());
//		System.out.println("나의 민첩능력치는 : " + character.getDex());
//		System.out.println("나의 지능능력치는 : " + character.getIntel());
		
	}

}
