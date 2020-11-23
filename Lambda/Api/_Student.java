package Lambda.Api;

public class _Student {
	private String name;
	private int english;
	private int math;
	
	public _Student(String name, int english, int math) {
		this.name = name;
		this.english = english;
		this.math = math;
	}
	
	public String getName() {return name;}
	public int getenglish() {return english;}
	public int getmath() {return math;}
}
