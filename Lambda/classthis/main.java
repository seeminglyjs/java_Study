package Lambda.classthis;

public class main {

	public static void main(String[] args) {
		UsingThis use = new UsingThis();
		UsingThis.Inner inner = use.new Inner();
		
		inner.method();
	}

}
