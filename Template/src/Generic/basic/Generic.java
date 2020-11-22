package Generic.basic;

public class Generic {

	public static void main(String[] args) {
		box<String> box = new box<String>();
		box.set("hello");
		String text = box.get();
		System.out.println(text);
	
		box<Integer> box1 = new box<Integer>();
		box1.set(100);
		int num  = box1.get();
		System.out.println(num);
	}

}
