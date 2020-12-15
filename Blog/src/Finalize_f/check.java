package Finalize_f;

public class check {
	private int checkNum;
	
	public check(int checkNum) {
		this.checkNum =checkNum;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(checkNum + "에 있는 finalize()실행");
	}
}
