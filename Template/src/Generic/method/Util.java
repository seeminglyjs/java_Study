package Generic.method;

public class Util {
	public static <T> box<T> boxing(T t){
		box<T> box = new box<>();
		box.set(t);
		return box;
	}
}
