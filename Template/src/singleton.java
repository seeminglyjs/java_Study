
public class singleton {
	private static singleton st = new singleton();
	
	private singleton() {}
	
	static singleton getSt() {
		return st;
	}
}