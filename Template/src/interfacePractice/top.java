package interfacePractice;

public interface top {
	public void think();
	
	default void speak (int a){
		if(a < 10) {
			System.out.println("�� ���ڴ� ������ ���� �۱���.");
		}else {
			System.out.println("�� ������ ������ �����ΰ� ���׿�.");
		}
	}
}
