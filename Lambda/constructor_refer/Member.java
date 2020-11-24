package Lambda.constructor_refer;

public class Member {
	private String name;
	private String id;
	
	public Member() {
		System.out.println("Member()");
	}
	
	public Member(String id) {
		System.out.println("Member(id)");
		this.id = id;
	}
	
	public Member(String name, String id) {
		System.out.println("Member(name / id)");
		this.name = name;
		this.id = id;
	}
}
