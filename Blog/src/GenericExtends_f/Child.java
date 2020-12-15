package GenericExtends_f;

public class Child <A,B,C> extends Parent{
	//제네릭타입을 상속받은 Child 클래스
	private C money;

	public C getMoney() {
		return money;
	}

	public void setMoney(C money) {
		this.money = money;
	}


}
