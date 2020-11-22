package Generic.method;

public class main {

	public static void main(String[] args) {
		box<Integer> box1 = Util.<Integer>boxing(100);
		int value = box1.get();
		System.out.println(value);
		
		
		box<String> box2 = Util.boxing("ȫ�浿");
		System.out.println(box2.get());
	}

}
