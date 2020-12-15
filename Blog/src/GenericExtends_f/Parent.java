package GenericExtends_f;

public class Parent <A,B> {
	//제넥릭타입 A/B를 가지는 Parent 클래스
	private A name;
	private B age;
	
	public A getName() {
		return name;
	}
	public void setName(A name) {
		this.name = name;
	}
	public B getAge() {
		return age;
	}
	public void setAge(B age) {
		this.age = age;
	}

	
}
