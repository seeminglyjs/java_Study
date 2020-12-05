package Generic2_f;

public class animal {
	private String name;
	
	public animal(String name) {
		this.name = name;
	}
	
	public String getName() {return name;}
	
	@Override
	public String toString() {
		return name;
	}
	
}
