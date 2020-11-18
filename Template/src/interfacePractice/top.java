package interfacePractice;

public interface top {
	public void think();
	
	default void speak (int a){
		if(a < 10) {
			System.out.println("그 숫자는 저에게 조금 작군요.");
		}else {
			System.out.println("그 정도면 적당한 숫자인거 같네요.");
		}
	}
}
